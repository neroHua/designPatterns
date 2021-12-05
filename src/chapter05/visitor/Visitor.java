package chapter05.visitor;

/**
 * visitor
 * 访问者模式
 *
 *
 * Intent
 * 意图
 *
 *      define the skeleton of an algorithm in an operation, deferring some steps to subclasses.
 *      在某个方法内定义算法的步骤, 有不同实现方式的步骤的通过子类来实现
 *      represent an operation to be performed on the elements of an object structure.
 *      呈现这样的一个操作：这个操作需要被一定结构上的对象上执行
 *      visitor lets you define a new operation without changing the classes of the elements on which it operates.
 *      该模式允许你定义一种新的操作不用改变被访问的对象
 *
 * Applicability
 * 适用场景
 *
 *      an object structure contains many classes of objects with differing interfaces, and you want to perform operations on these objects that depend on their concrete classes.
 *      一个对象结构包含了很多对象的接口,而你想执行某种操作,对于不同的接口处理的方式也不一样
 *      many distinct and unrelated operations need to be performed on objects in an object structure, and you want to avoid "polluting" their classes with these operations.
 *      很多操作甚至是不相关的,需要在对象的结构上执行,你又不想把这些操作放在对象上
 *      structure rarely change, but you often want to define new operation
 *      结构相对比较固定,你总是想增加多的方法
 *
 *  Consequences
 *  特点
 *
 *      it's easy for add new visitor
 *      比较容易增加访问者
 *      it's hard for add new element
 *      增加被访问的元素比较困难
 *      break encapsulation
 *      打破封装
 *
 */
public class Visitor {
}
