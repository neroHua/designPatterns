package chapter03.abstractFactory.old.better01;

public final class WheelB003 extends BaseWheelB implements Spinable {

    @Override
    public void spin() {
        System.out.println("我旋转的速度是30圈每秒");
    }

}
