package chapter02.origin;

public final class Car002 extends BaseCar implements Runable {

    @Override
    public void run() {
        System.out.println("我行驶的速度是2米每秒");
    }

}
