package chapter04.facade.old;

public class SystemAImpl implements SystemA {

    @Override
    public void start() {
        System.out.println("a1启动");
    }

    @Override
    public void shutdown() {
        System.out.println("a1关闭");
    }

}
