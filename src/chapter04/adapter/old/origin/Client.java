package chapter04.adapter.old.origin;

/**
 * 适配器模式 + 组合
 * 
 * 引用第三类，但是第三方类并不完全符合目前的需求，在不改变第三方类的情况下，调用第三方类.需要定义己方需要的接口，用adapter来实现己方的接口
 * 
 * 
 * @author 滑德友
 * @time 2019年2月7日11:11:50
 *
 */
public class Client {

    public static void main(String[] args) {
        NewA newA = new NewA();
        newA.new01();
        newA.new02();
        newA.new03();
    }

}
