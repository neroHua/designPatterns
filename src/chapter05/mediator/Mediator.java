package chapter05.mediator;

/**
 * iterator
 * 迭代器模式
 *
 * Also known as
 * 别称
 *      cursor
 *      迭代器模式
 *
 * Intent
 * 意图
 *      provide a way to access the elements of an aggregate object sequentially without exposing its underlying representation.
 *      提供一种访问对象的容器的方式。这种方式通常是统一的。这种方式访问内部对象时不用暴露容器内部的细节
 *
 * Applicability
 * 适用场景
 *
 *      to access an aggregate object's contents without exposing its internal representation
 *      方位容器内部对象而不用暴露内部容器内部状态
 *      to provide a uniform interface for traversing different aggregate structures.
 *      统一的方式来访问不同结构的容器
 *
 *  Consequences
 *  特点
 *
 *      the proxy pattern introduces a level of indirection when accessing an object
 *      代理模式提供了一种间接访问对象的方式
 *      it supports variations in the traversal of an aggregate.
 *      支持各种容器
 *      iterator simply the aggregate interface.
 *      简化了容器接口
 *      more than one traversal can be pending on an aggregate.
 *      容器可以同时进行多个遍历
 *
 */
public class Mediator {
}
