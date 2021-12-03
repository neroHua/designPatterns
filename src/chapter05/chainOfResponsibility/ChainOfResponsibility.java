package chapter05.chainOfResponsibility;

/**
 * chainOfResponsibility
 * 责任链模式
 *
 * Motivation
 * 动机
 *
 *      avoid couping the sender of a request to its receiver by giving more than one object a chance to handle hte request.
 *      通过给更多对象一个机会来处理请求来避免发送请求发送者和接收者的耦合
 *
 * Applicability
 * 适用场景
 *
 *      you want to issue a request to one of several objects without specifying the receiver explicitly.
 *      你想把请求抛给几个对象而不用说明接收者
 *      the set of objects that can handle a request should be specified dynamically
 *      这些可以处理请求的对象应该被动态的使用
 *
 *  Consequences
 *  特点
 *
 *      pluggable adapters: a class is more reusable when you minimize the assumptions other class must make to use it
 *      插件适配：类越小越有助于适配
 *      using two-way adapters to provide transparency: class adapter and object adapter
 *      有两种方式提供使用:类适配器和对象适配器
 *      reduced coupling
 *      减少耦合
 *      adding flexibility in assigning responsibilities to objects.
 *      灵活动态的添加责任
 *      receipt isn't guaranteed
 *      不能确定最终的处理者
 *
 */
public class ChainOfResponsibility {
}
