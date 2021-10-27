package chapter04.bridge;

/**
 * bridge
 * 桥接模式
 *
 * Motivation
 * 动机
 *
 *      sometimes a toolkit class that's designed for reuse isn't reuse isn't reusable only because its interface doesn't match the domain-specific interface an application requires
 *      有时工具包提供的类的接口不满足我们使用的接口的声明
 *
 * Applicability
 * 适用场景
 *
 *      you want to reuse an existing class, ant its interface does not match the one you need
 *      你想使用一个已经存在的类,但是他的接口不满足现在需要
 *
 *  Consequences
 *  特点
 *
 *      pluggable adapters: a class is more reusable when you minimize the assumptions other class must make to use it
 *      插件适配：类越小越有助于适配
 *      using two-way adapters to provide transparency: class adapter and object adapter
 *      有两种方式提供使用:类适配器和对象适配器
 *
 */
public class Bridge {
}
