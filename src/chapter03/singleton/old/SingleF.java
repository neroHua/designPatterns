package chapter03.singleton.old;

public class SingleF {
    
    public static SingleF getInstance() {
        return SingleFHolder.singleF;
    }
    
    public static class SingleFHolder {
        private static final SingleF singleF = new SingleF();
    }

}
