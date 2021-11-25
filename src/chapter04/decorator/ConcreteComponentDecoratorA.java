package chapter04.decorator;

public class ConcreteComponentDecoratorA extends ComponentDecorator {

    public ConcreteComponentDecoratorA(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        a();
    }

    private void a() {

    }

}
