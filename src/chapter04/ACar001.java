package chapter04;

public final class ACar001 extends ABaseCar implements Runable {

    @Override
    public void run() {
        System.out.println("我行驶的速度是1米每秒");
    }

}
