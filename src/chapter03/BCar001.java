package chapter03;

public final class BCar001 extends BBaseCar implements Runable {

    @Override
    public void run() {
        System.out.println("我行驶的速度是10米每秒");
    }

}
