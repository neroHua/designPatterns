package chapter03.prototype;

/**
 * prototype
 * 原型模式
 *
 * Intent
 * 意图
 *      specify the kinds of objects to create using a prototypical instance, and create new objects by copying this prototype.
 *      使用原型对象声明要创建的对象的种类,并以此原型复制新的对象
 *
 * Motivation
 * 动机
 *      to reduce the number of classes
 *      为了减少类的数量
 *
 * Applicability
 * 适用场景
 *
 *      a system should be independent of how its product are created, composed and represented
 *      一个系统跟他产品的创建，组合，呈现是相互独立的
 *      and when the classes to instantiate are specified at run time
 *      类的初始化是在运行时
 *      or to avoid building a class hierarchy of factory that parallels the class hierarchy of products
 *      为了避免使用工厂方法而出现两个平行的类继承体系
 *      or when instances of a class can have one of only a few different combinations of state. copy is more convenient for instance
 *      类由少量不同的状态组成时, 复制比创建更简单
 *
 *  Consequences
 *  特点
 *
 *      adding and removing products at run-time
 *      运行期间增加删除产品
 *      specifying new objects by varying values / structure
 *      声明新的对象通过改变值/结构
 *      reduced subclassing
 *      减少继承
 *
 *
 * vary
 * 变种
 *
 *      using a prototype manager
 *      使用原型管理器,统一维护原型
 *
 * special
 *      shallow copy: copied object share state with prototype
 *      浅拷贝:拷贝出来的新对象和原型共享内部状态
 *      deep copy: copied object do not share state with prototype
 *      深拷贝: 拷贝出来的新对象和原型不共享内部状态
 *
 */
public class Prototype {
}
