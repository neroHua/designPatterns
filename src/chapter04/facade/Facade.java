package chapter04.facade;

/**
 * facade
 * 外观模式
 *
 * Intent
 * 意图
 *      provide a unified interface to a set of interfaces in a subsystem.
 *      为一个具有很多接口的系统提供一个统一的接口
 *      facade defines a higher-level interface that make the subsystem easier to use.
 *      定义了一个更高层次的接口，这个接口使得子系统更加容易使用
 *
 *
 * Applicability
 * 适用场景
 *
 *      you want to provide a simple interface to a complex subsystem.
 *      你想为一个复杂的系统提供一个简单的接口
 *      there are many dependencies between clients and the implementation classes of an abstraction.
 *      客户端和系统交互有比较复杂的交互和依赖关系
 *      you want to layer your subsystem.
 *      你想使你的子系统层次分明
 *
 *  Consequences
 *  特点
 *
 *      it shields clients from subsystem components.
 *      使客户端感知不到子系统的存在
 *      it promotes weak coupling between the subsystem and its clients.
 *      促进客户端和子系统的低耦合
 *
 */
public class Facade {
}
