package chapter04;

public final class AWheel002 extends ABaseWheel implements Spinable {

    @Override
    public void spin() {
        System.out.println("我旋转的速度是2圈每秒");
    }

}
