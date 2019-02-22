package chapter23;

public class TVCloseState implements State {

    @Override
    public void doAction() {
        System.out.println("电视机正在关闭！");
        System.out.println("电视机已经关闭！");
    }

}
