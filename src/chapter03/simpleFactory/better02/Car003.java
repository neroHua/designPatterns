package chapter03.simpleFactory.better02;

public final class Car003 extends BaseCar implements Runable {

    @Override
    public void run() {
        System.out.println("我行驶的速度是3米每秒");
    }

}
