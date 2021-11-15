package chapter04.bridge;

/**
 * bridge
 * 桥接模式
 *
 * Motivation
 * 动机
 *
 *      when an abstraction can have one of several possible implementations,
 *      the usual way to accommodate them is to use inheritance.
 *      but this approach isn't always flexible enough.
 *      当一个抽象有多个不同的变化的方向时，通常的处理办法是使用继承去实现。
 *      但是这种方式并不是非常灵活。
 *
 * Applicability
 * 适用场景
 *
 *      you want to avoid a permanent binding between an abstraction and its implementation.
 *      你想避免抽象和实现的仅仅绑定在一起
 *      both the abstractions and their implementations should be extensible by subclassing.
 *      不同的抽象和他们的实现可以通过继承的方式进行扩展
 *      changes in the implementations of an abstraction should have no impact on clients
 *      实现的改动应该不影响客户端
 *
 *  Consequences
 *  特点
 *
 *      decoupling interface and implementations.
 *      抽象和实现的解耦
 *      improved extensibility
 *      提高了扩展性
 *      hiding implementations detail from clients
 *      向客户端隐藏了实现的细节
 *
 */
public class Bridge {
}
