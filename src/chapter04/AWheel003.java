package chapter04;

public final class AWheel003 extends ABaseWheel implements Spinable {

    @Override
    public void spin() {
        System.out.println("我旋转的速度是3圈每秒");
    }

}
