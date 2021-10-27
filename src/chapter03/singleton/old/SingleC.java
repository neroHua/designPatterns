package chapter03.singleton.old;

public class SingleC {

    private static SingleC singleC;
    
    public static SingleC getInstance() {
        if (singleC == null) {
            singleC = new SingleC();
        }

        return singleC;
    }
    
}
