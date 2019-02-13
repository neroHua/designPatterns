package chapter13;

public class SystemB1 implements SystemB {

    @Override
    public void start() {
        System.out.println("b1启动");
    }

    @Override
    public void shutdown() {
        System.out.println("b1关闭");
    }

}
