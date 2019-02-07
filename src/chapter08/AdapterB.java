package chapter08;

public class AdapterB implements NewA {

    private OldB oldB = new OldB();
    
    @Override
    public void method01() {
        oldB.method01();
    }

    @Override
    public void method02() {
        oldB.method02();
    }

    @Override
    public void method03() {
        oldB.method03();
    }
    
}
