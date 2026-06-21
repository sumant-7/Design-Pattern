package Singleton;

public class SingletonDesignPattern {
//    private volatile static SingletonDesignPattern instance;

    private SingletonDesignPattern(){
        System.out.println("Singleton Design Pattern");
    }
    private static class SingletonDesignPatternHelper{
        private final static SingletonDesignPattern instance  = new SingletonDesignPattern();
    }
    public static SingletonDesignPattern getInstance(){
        return SingletonDesignPatternHelper.instance;
    }


/** /double locking
    public static SingletonDesignPattern getInstance(){

            if (instance == null) {
                synchronized (SingletonDesignPattern.class) {
                    if(instance == null)
                        instance = new SingletonDesignPattern();
                }
            }
            return instance;
    } */
}
