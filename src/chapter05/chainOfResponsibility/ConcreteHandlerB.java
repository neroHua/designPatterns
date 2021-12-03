package chapter05.chainOfResponsibility;

public class ConcreteHandlerB extends Handler {

    public ConcreteHandlerB(Handler successor) {
        super(successor);
    }
}
