package chapter03.singleton.old;

public class SingleB {

    private static SingleB singleB;
    
    public static SingleB getInstance() {
        singleB = new SingleB();
        
        return singleB;
    }
    
}
