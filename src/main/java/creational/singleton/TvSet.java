package creational.singleton;

//-----------Eager initialization--------------

//public class TvSet{
//    private static final TvSet instance = new TvSet();
//    private TvSet()
//    {
//        // Private Constructor
//    }
//    public static TvSet getInstance()
//    {
//        return instance;
//    }
//}

//----------Lazy initialization----------------

//public class TvSet{
//    private static TvSet instance;
//    private TvSet()
//    {
//        //Private Constructor
//        System.out.println("Instance created by: " + Thread.currentThread().getName());
//    }
//    public static TvSet getInstance()
//    {
//        if(instance==null)
//        {
//            instance = new TvSet();
//        }
//        return instance;
//    }
//}

//---------------Thread safe initialization -------------------

//public class TvSet{
//    private static TvSet instance;
//    private TvSet()
//    {
//        //Private Constructor
//        System.out.println("Instance created by: " + Thread.currentThread().getName());
//    }
//    synchronized public static TvSet getInstance()
//    {
//        if(instance==null)
//        {
//            instance = new TvSet();
//        }
//        return instance;
//    }
//}

//-------------------Double Checked locking -----------------

public class TvSet{
    private static volatile TvSet instance;
    private TvSet()
    {
        //Private Constructor
        System.out.println("Instance created by: " + Thread.currentThread().getName());
    }
    public static TvSet getInstance()
    {
        if(instance==null) {
            synchronized (TvSet.class) {
                if (instance == null) {
                    instance = new TvSet();
                }
            }
        }
        return instance;
    }
}