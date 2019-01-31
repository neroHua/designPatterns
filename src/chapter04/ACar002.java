package chapter04;

public final class ACar002 extends ABaseCar implements Runable {

    @Override
    public void run() {
        System.out.println("我行驶的速度是2米每秒");
    }

}
