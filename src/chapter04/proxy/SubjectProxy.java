package chapter04.proxy;

public class SubjectProxy implements Subject {

    private Subject subject;

    @Override
    public void request() {
        if (null == subject) {
            subject = new RealSubject();
        }

        subject.request();
    }

}
