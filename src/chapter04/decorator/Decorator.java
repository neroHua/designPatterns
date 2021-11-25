package chapter04.decorator;

/**
 * decorator
 * 装饰器模式
 *
 * Also known as
 * 别称
 *      wrapper
 *      包装模式
 *
 * Intent
 * 意图
 *      attach additional responsibilities to an object dynamically.
 *      动态的给对象添加额外职责
 *      decorators provide a flexible alternative to subclassing for extending functionality.
 *      装饰器模式提供了一种灵活的子类扩展方式
 *
 *
 * Applicability
 * 适用场景
 *
 *      to add responsibilities to individual objects dynamically and transparently without affecting other objects
 *      透明的且动态的给单个对象增加责任而不影响其他对象
 *      for responsibilities that can be withdrawn.
 *      责任可以取消(动态的取出被包装的对象)
 *      when extension by subclassing is impractical.
 *      当通过子类进行扩展受限制时（动态组合）
 *
 *
 *  Consequences
 *  特点
 *
 *      more flexibility than static inheritance.
 *      比静态的继承更加灵活
 *      avoids feature-lade classes high up in hierarchy.
 *      降低继承的层次
 *      lots of little objects.
 *      很多小对象
 *
 *  Implements
 *  实现
 *
 *      interface conformance.
 *      同一个父接口
 *      omitting the abstract decorator class.
 *      可以省略抽象父类，只有一个装饰器时
 *      keeping component classes lightweight
 *      确保父接口尽量轻量
 *
 */
public class Decorator {
}
