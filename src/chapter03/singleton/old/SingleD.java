package chapter03.singleton.old;

public class SingleD {

    private static SingleD singleD;

    public synchronized static SingleD getInstance() {
        if (singleD == null) {
            singleD = new SingleD();
        }
        
        return singleD;
    }

}
