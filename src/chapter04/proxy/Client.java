package chapter04.proxy;

public class Client {

    public static void main(String[] args) {
        Subject subject = new SubjectProxy();
        subject.request();
    }

}
