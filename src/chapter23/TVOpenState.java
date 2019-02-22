package chapter23;

public class TVOpenState implements State {

    @Override
    public void doAction() {
        System.out.println("电视机正在打开！");
        System.out.println("电视机已经打开！");
    }

}
