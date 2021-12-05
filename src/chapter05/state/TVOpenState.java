package chapter05.state;

public class TVOpenState implements TVState {

    @Override
    public void doAction() {
        System.out.println("change success");
    }

}
