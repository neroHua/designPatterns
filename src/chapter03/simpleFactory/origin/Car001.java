package chapter03.simpleFactory.origin;

public final class Car001 extends BaseCar implements Runable {

    @Override
    public void run() {
        System.out.println("我行驶的速度是1米每秒");
    }

}
