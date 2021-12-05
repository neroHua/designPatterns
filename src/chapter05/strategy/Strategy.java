package chapter05.strategy;

/**
 * strategy
 * 策略模式
 *
 * Also known as
 * 别称
 *      policy
 *      迭代器模式
 *
 * Intent
 * 意图
 *      define a family of algorithms, encapsulate each one, and make them interchangeable.
 *      定义并封装每个类似的算法,并且使他们可以相互替换
 *      strategy lets the algorithm vary independently from clients that use it.
 *      每个策略模式可以独立的变化
 *
 * Applicability
 * 适用场景
 *
 *      many related classes differ only in their behavior
 *      很多相近的类
 *      you need different variants of an algorithm.
 *      需要独立变化算法
 *      an algorithm uses data that client shouldn't know about.
 *      算法的使用的数据客户端不需要知道
 *      a class defines many behaviors, and too many conditional statements. move related condition as an object.
 *      一个类定义很多行为,且有很多条件,可以把相关条件变成一个对象
 *
 *  Consequences
 *  特点
 *
 *      families of related algorithms
 *      相近的算法
 *      strategies eliminate conditional statements
 *      减少条件语句
 *      clients must be aware of different Strategies
 *      客户端必须要知道每个策略的不同
 *
 */
public class Strategy {
}
