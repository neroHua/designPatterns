package chapter05;

public class SingleA {

    private static final SingleA singleA = new SingleA();
    
    public static SingleA getInstance() {
        return singleA;
    }
    
}
