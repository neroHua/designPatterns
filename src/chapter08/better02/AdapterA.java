package chapter08.better02;

public class AdapterA implements NewA {

    OldA oldA = new OldA();

    @Override
    public void new01() {
        oldA.old01();
    }

    @Override
    public void new02() {
        oldA.old02();
    }

    @Override
    public void new03() {
        oldA.old03();
    }
    
}
