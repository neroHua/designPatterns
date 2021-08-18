package chapter03.abstractFactory.old.better01;

public final class CarB003 extends BaseCarB implements Runable {

    @Override
    public void run() {
        System.out.println("我行驶的速度是30米每秒");
    }

}
