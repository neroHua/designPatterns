package chapter03.abstractFactory.old.better02;

public final class WheelB002 extends BaseWheelB implements Spinable {

    @Override
    public void spin() {
        System.out.println("我旋转的速度是20圈每秒");
    }

}
