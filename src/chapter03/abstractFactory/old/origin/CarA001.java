package chapter03.abstractFactory.old.origin;

public final class CarA001 extends BaseCarA implements Runable {

    @Override
    public void run() {
        System.out.println("我行驶的速度是1米每秒");
    }

}
