package chapter03.abstractFactory.old.origin;

public final class WheelB001 extends BaseWheelB implements Spinable {

    @Override
    public void spin() {
        System.out.println("我旋转的速度是10圈每秒");
    }

}
