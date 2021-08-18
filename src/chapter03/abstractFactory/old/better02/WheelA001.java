package chapter03.abstractFactory.old.better02;

public final class WheelA001 extends BaseWheelA implements Spinable {

    @Override
    public void spin() {
        System.out.println("我旋转的速度是1圈每秒");
    }

}
