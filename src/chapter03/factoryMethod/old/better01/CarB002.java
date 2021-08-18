package chapter03.factoryMethod.old.better01;

public final class CarB002 extends BaseCarB implements Runable {

    @Override
    public void run() {
        System.out.println("我行驶的速度是20米每秒");
    }

}