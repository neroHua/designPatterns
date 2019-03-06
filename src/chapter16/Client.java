package chapter16;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * 责任链模式(chain of responsibility)
 * 对某个对象进行连续的处理，过程中对象可以改变
 * 
 * @author 滑德友
 * @time 2019年2月18日19:11:05
 *
 */
public class Client {

    public static void main(String[] args) {
        List<AbstractLogger> loggerList = new ArrayList<>();
        loggerList.add(new ErrorLogger());
        loggerList.add(new InfoLogger());
        loggerList.add(new DebugLogger());

        LoggerChain loggerChain = new LoggerChain(loggerList);

        loggerChain.logMessage(1, "我是小明");
        loggerChain.logMessage(3, "我是大明");
    }

}
