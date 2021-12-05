package chapter05.strategy.old;

public class OperationAdd implements Operation {

    @Override
    public int operation(int number1, int number2) {
        return number1 + number2;
    }

}
