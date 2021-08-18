package chapter03.abstractFactory.old.better01;

public final class CarA003 extends BaseCarA implements Runable {

    @Override
    public void run() {
        System.out.println("我行驶的速度是3米每秒");
    }

}
