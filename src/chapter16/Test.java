package chapter16;

/**
 * 
 * 责任链模式
 * 对某个对象进行连续的处理，过程中对象可以改变
 * 
 * @author 滑德友
 * @time 2019年2月18日19:11:05
 *
 */
public class Test {

    public static void main(String[] args) {
        LoggerChain loggerChain = new LoggerChain();

        loggerChain.logMessage(1, "我是小明");
        loggerChain.logMessage(3, "我是大明");
    }

}
