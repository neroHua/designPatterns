package chapter05;

public class SingleB {

    private static SingleB singleB;
    
    public static SingleB getInstance() {
        singleB = new SingleB();
        
        return singleB;
    }
    
}
