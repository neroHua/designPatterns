package chapter15;

import java.lang.reflect.Proxy;

/**
 * 
 * 代理模式(proxy)
 * 静态代理和动态代理，AOP编程
 * 
 * 
 * @author 滑德友
 * @time 2019年2月15日12:47:13
 *
 */
public class Client {

    public static void main(String[] args) {
        
        StaticGoodsAProxy staticGoodsAProxy = new StaticGoodsAProxy(new StaticGoodsA(10));
        staticGoodsAProxy.showMyPrice();
        
        DynamicGoods dynamicGoodsAProxy = (DynamicGoods)Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), new Class<?>[] {DynamicGoods.class}, new DynamicGoodsAProxy(new DynamicGoodsA(10, "动态商品A")));
        dynamicGoodsAProxy.showMyPrice();
        dynamicGoodsAProxy.showMyName();
        
    }

}
