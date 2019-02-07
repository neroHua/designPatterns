package chapter08;

public class AdapterA extends OldA implements NewA {

    @Override
    public void method01() {
        super.method01();
    }

    @Override
    public void method02() {
        super.method02();
    }

    @Override
    public void method03() {
        super.method03();
    }
    
    @Override
    public void method04() {
        throw new RuntimeException("不支持的方法");
    }
    
}
