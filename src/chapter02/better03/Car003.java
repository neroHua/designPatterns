package chapter02.better03;

public final class Car003 extends BaseCar implements Runable {

    @Override
    public void run() {
        System.out.println("我行驶的速度是3米每秒");
    }

}
