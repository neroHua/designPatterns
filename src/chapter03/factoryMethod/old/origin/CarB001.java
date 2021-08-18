package chapter03.factoryMethod.old.origin;

public final class CarB001 extends BaseCarB implements Runable {

    @Override
    public void run() {
        System.out.println("我行驶的速度是10米每秒");
    }

}
