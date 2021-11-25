package chapter04.decorator;

public class ConcreteComponentDecoratorB extends ComponentDecorator {

    public ConcreteComponentDecoratorB(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        b();
    }

    private void b() {

    }

}
