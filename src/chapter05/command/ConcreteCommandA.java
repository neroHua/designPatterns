package chapter05.command;

public class ConcreteCommandA implements CommandInterface {

    private Receiver receiver;

    public ConcreteCommandA(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.actionA();
    }

}
