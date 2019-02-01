package chapter05;

public class SingleD {

    private static SingleD singleD;

    public synchronized static SingleD getInstance() {
        if (singleD == null) {
            singleD = new SingleD();
        }
        
        return singleD;
    }

}
