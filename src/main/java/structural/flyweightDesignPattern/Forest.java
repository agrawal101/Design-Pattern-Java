package structural.flyweightDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Forest {

    List<Tree> trees = new ArrayList<>();
    public void plantTree(int x,int y,String name,String color,String texture)
    {
        Tree tree = new Tree(x,y,TreeFactory.getTreeType(name,color,texture));
        trees.add(tree);
        draw();
    }
    public void draw()
    {
        for(Tree tree:trees)
        {
            tree.draw();
        }
    }
}
