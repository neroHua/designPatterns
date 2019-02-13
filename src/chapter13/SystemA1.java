package chapter13;

public class SystemA1 implements SystemA {

    @Override
    public void start() {
        System.out.println("a1启动");
    }

    @Override
    public void shutdown() {
        System.out.println("a1关闭");
    }

}
