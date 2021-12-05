package chapter05.state;

public class TVCloseState implements TVState {

    @Override
    public void doAction() {
        System.out.printf("TV is closed. cant change");
    }

}
