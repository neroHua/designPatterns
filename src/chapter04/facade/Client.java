package chapter04.facade;

public class Client {

    public static void main(String[] args) {
        SystemFacade systemFacade = new SystemFacadeImpl();
        systemFacade.job();
    }

}
