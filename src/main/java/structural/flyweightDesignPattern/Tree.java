package structural.flyweightDesignPattern;

public class Tree {

    int x;
    int y;
    TreeType treeType;

    public Tree(int x,int y,TreeType treeType)
    {
        this.x = x;
        this.y = y;
        this.treeType = treeType;
    }

    public void draw()
    {
        treeType.draw(x,y);
    }
}
