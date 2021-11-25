package chapter04.facade.old;

public class SystemBImpl implements SystemB {

    @Override
    public void start() {
        System.out.println("b1启动");
    }

    @Override
    public void shutdown() {
        System.out.println("b1关闭");
    }

}
