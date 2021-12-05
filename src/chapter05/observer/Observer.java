package chapter05.observer;

/**
 * observer
 * 观察者模式
 *
 * Also known as
 * 别称
 *      dependents, publish-subscribe
 *      观察者模式
 *
 * Intent
 * 意图
 *      define a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.
 *      定义一个一对多的依赖来满足当一个对象变化时，依赖他的多个对象自动改变
 *
 * Applicability
 * 适用场景
 *
 *      when an abstraction has two aspects, one dependent on the other.
 *      当一个抽象有两个维度的变化,一个依赖于另外一个
 *      when a change to one object requires changing others , you don't know how many objects and what objects need to be changed.
 *      但一个对象改变，其他对象跟着变化，而你不知道要变化的对象有多少,也不知道要变化的是什么对象
 *
 *  Consequences
 *  特点
 *
 *      subject and observer can change independently,but it's easy to change observer
 *      被观察对象和观察者可以独立的变化,但是观察者更加容易变化
 *      abstract coupling between subject and observer
 *      抽象了别观察对象和观察者
 *      support for broadcast communication
 *      支持广播模式
 *      unexpected updates
 *      要注意可能会改变观察者内部的其他状态,导致出错
 *
 */
public class Observer {
}
