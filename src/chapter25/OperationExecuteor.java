package chapter25;

public class OperationExecuteor {
    
    Operation operation;
    
    public OperationExecuteor(Operation operation) {
        this.operation = operation;
    }
    
    public int execute(int number1, int number2) {
        return operation.operation(number1, number2);
    }

}
