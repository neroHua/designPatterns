package chapter05.command;

public class Client {

    public static void main(String[] args) {
        CommandInterface commandInterfaceA = new ConcreteCommandA(new Receiver());
        CommandInterface commandInterfaceB = new ConcreteCommandB(new Receiver());

        Invoker invoker = new Invoker();
        invoker.storeCommand(commandInterfaceA);
        invoker.storeCommand(commandInterfaceB);

        // waiting to ask invoker to executeCommand
        invoker.executeCommand(1);
        invoker.executeCommand(2);
    }

}
