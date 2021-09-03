package chapter03.builder;

/**
 * builder
 * 构造者模式
 *
 * Intent
 * 意图
 *      separate the construction of a complex object from its representation so that same construction process can create different representations.
 *      分离复杂对象的构造函数和构造创建的对象，是为了一个构造方法可创建不同的状态的对象。
 *
 * Motivation
 * 动机
 *      finger control construct complex object
 *      手动的随心的构造复杂对象
 *
 * Applicability
 * 适用场景
 *
 *      the algorithm for creating a complex object should be independent of parts that make up the object and how they're assembled
 *      创建复杂对象的算法应该独立于组成对象的部件并且独立于装配部件的过程
 *      the construction process must allow different representations for the object that's constructed.
 *      构造函数必须要能创建不同状态的对象
 *
 *  Consequences
 *  特点
 *
 *      it lets you vary a product's internal representation
 *      它允许你独立的变化产品的内部状态
 *      it isolates code for construct and representation
 *      它隔离了构造代码和设置内部状态的代码
 *      it gives you finer control over the construction process
 *      它给你手动控制构造过程的体验
 *
 * vary
 * 变种
 *
 *      remove director
 *      去掉 director 参考 old
 *
 */
public class Builder {
}
