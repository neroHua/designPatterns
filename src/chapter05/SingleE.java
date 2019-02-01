package chapter05;

public class SingleE {

    private static SingleE singleE;

    public static SingleE getInstance() {
        if (singleE == null) {
            synchronized (SingleE.class) {
                if (singleE == null) {
                    singleE = new SingleE();
                }
            }
        }
        
        return singleE;
    }

}
