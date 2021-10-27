package chapter03.singleton.old;

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
