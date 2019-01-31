package chapter03;

public final class BCar003 extends BBaseCar implements Runable {

    @Override
    public void run() {
        System.out.println("我行驶的速度是30米每秒");
    }

}
