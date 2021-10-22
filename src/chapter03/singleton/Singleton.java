package chapter03.singleton;

/**
 * singleton
 * 单例模式
 *
 * Intent
 * 意图
 *       ensure a class only has one instance, and provide a global point of access to it.
 *       确保class只有一个实例,并提供访问者唯一对象的方式
 *
 * Motivation
 * 动机
 *      it's important for some classes to have exactly one instance.
 *      有这种场景
 *
 * Applicability
 * 适用场景
 *
 *      there must be exactly one instance of a class, and it must be accessible to clients from a well-known access point
 *      只能有一个实例
 *      when the sole instance should be extensible by subclassing, and clients should be able to use an extended instance without modifying their code
 *      唯一实例的class可以被继承,用子实例去替换父实例,而不用改变老的代码
 *
 *  Consequences
 *  特点
 *
 *      controlled access to sole instance
 *      严格控制访问
 *      reduce name space
 *      减少命名空间
 *      permits refinement of operations and representation
 *      易于扩展子类/注意static不支持多态/只能覆盖
 *
 * special
 *      注意static
 *
 */
public class Singleton {
}
