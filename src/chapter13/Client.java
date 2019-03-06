package chapter13;

/**
 * 
 * 外观模式(facade)
 * 简化与客户端交互，客户端由面向各个子系统 -> 客户端面向接待员
 * 
 * @author 滑德友
 * @time 2019年2月13日16:42:15
 *
 */
public class Client {

    public static void main(String[] args) {
        SystemFacade systemFacade = new SystemFacadeImpl(new SystemAImpl(), new SystemBImpl(),new SystemCImpl());
        systemFacade.job();
    }

}
