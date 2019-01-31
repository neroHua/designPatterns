package chapter04;

public final class BCar002 extends BBaseCar implements Runable {

    @Override
    public void run() {
        System.out.println("我行驶的速度是20米每秒");
    }

}
