package chapter04;

public final class BWheel001 extends BBaseWheel implements Spinable {

    @Override
    public void spin() {
        System.out.println("我旋转的速度是10圈每秒");
    }

}
