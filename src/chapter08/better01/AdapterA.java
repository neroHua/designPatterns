package chapter08.better01;

public class AdapterA extends OldA implements NewA {

    @Override
    public void new01() {
        super.old01();
    }

    @Override
    public void new02() {
        super.old02();
    }

    @Override
    public void new03() {
        super.old03();
    }
    
}
