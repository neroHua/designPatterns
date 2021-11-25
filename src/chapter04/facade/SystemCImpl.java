package chapter04.facade;

public class SystemCImpl implements SystemC {

    @Override
    public void start() {
        System.out.println("c1启动");
    }

    @Override
    public void job() {
        System.out.println("c1工作");
    }

    @Override
    public void shutdown() {
        System.out.println("c1关闭");
    }

}
