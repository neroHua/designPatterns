package chapter05.chainOfResponsibility;

public class ConcreteHandlerA extends Handler {

    public ConcreteHandlerA(Handler successor) {
        super(successor);
    }
}
