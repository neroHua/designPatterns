package chapter05.chainOfResponsibility;

public class Client {

    public static void main(String[] args) {
        ConcreteHandlerA concreteHandlerA = new ConcreteHandlerA(new ConcreteHandlerB(null));
        concreteHandlerA.handleRequest(new Request());
    }

}
