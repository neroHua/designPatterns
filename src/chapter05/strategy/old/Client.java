package chapter05.strategy.old;

/**
 * 
 * 策略模式(strategy)
 * 当选择比较多时，直接在将选择包装成各个类
 * 
 * @author 滑德友
 * @time 2019年2月22日13:23:26
 *
 */
public class Client {

    public static void main(String[] args) {
        int number1 = 5;
        int number2 = 5;
        
        OperationExecuteor operationExecuteor1 = new OperationExecuteor(new OperationAdd());
        OperationExecuteor operationExecuteor2 = new OperationExecuteor(new OperationSubstract());

        System.out.println(operationExecuteor1.execute(number1, number2));
        System.out.println(operationExecuteor2.execute(number1, number2));
    }

}
