package chapter03.singleton.old;

public class SingleA {

    private static final SingleA singleA = new SingleA();
    
    public static SingleA getInstance() {
        return singleA;
    }
    
}
