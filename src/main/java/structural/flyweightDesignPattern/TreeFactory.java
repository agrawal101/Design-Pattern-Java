package structural.flyweightDesignPattern;

import java.util.HashMap;

public class TreeFactory {

    static HashMap<String,TreeType> treeHashMap = new HashMap<>();
    public static TreeType getTreeType(String name,String color,String texture)
    {
        String key = name+"-"+color+"-"+texture;
        if(!treeHashMap.containsKey(key))
        {
            treeHashMap.put(key,new TreeType(name,color,texture));
        }
        return treeHashMap.get(key);
    }
}
