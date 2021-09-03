package chapter03.factoryMethod;

/**
 * factory method
 * 工厂方法模式
 *
 * Also Known As
 * 其他名称
 *
 *      virtual construct
 *
 * Motivation
 * 动机
 *
 *      a framework use interface or abstract class to maintain relationships between object also responsible for create object
 *      一个框架使用接口或者抽象类来维护对象的关系，同时又有责任创建他们，但是却不能具体的创建对象
 *
 * Applicability
 * 适用场景
 *
 *      a class can't anticipate the class of objects it must create.
 *      一个类要去创建对象，但是却不知道具体的对象的类
 *      a class wants it subclass to specify the objects it must create.
 *      一个类想要自己的子类去决定创建的具体的对象的类
 *      a class delegate responsibility to one of several helper subclass, and you want to localize the knowledge of which helper subclass is the delegate
 *      一个类委托创建对象的责任到一些帮助类，并且，你希望由具体的帮助类来决定创建的具体的对象的类
 *
 *  Consequences
 *  特点
 *
 *      provide hooks for subclasses
 *      提供了子类交互定义
 *      connect parallel class hierarchies
 *      平行的连接子类的继承，参考书中的图形理解，跟上面一条有直接关系
 *
 *  vary
 *  变种
 *
 *      creator provide implement the factory method to create a default product
 *      创建类的工厂方法默认创建一个默认的产品
 *      parameteried factory method
 *      工厂方法带有参数
 *      use templates with generic to avoid subclassing
 *      使用带有泛型的模板来避免继承
 *      naming conventions
 *      方法名字变更为其他名字factoryMethod -> createProduct
 *
 */
public class FactoryMethod {
}
