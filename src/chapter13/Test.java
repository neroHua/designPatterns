package chapter13;

/**
 * 
 * 装饰模式
 * 简化与客户端交互，客户端由面向各个子系统 -> 客户端面向接待员
 * 
 * @author 滑德友
 * @time 2019年2月13日16:42:15
 *
 */
public class Test {

    public static void main(String[] args) {
        SystemFacade systemFacade = new SystemFacade1(new SystemA1(), new SystemB1(),new SystemC1());
        systemFacade.job();
    }

}
