package chapter02.better02;

public final class Car001 extends BaseCar implements Runable {

    @Override
    public void run() {
        System.out.println("我行驶的速度是1米每秒");
    }

}
