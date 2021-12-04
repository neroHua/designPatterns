package chapter05.mediator;

/**
 * mediator
 * 中介者模式
 *
 * Intent
 * 意图
 *      define an object that encapsulates how a set of objects interact. interaction vary independently.
 *      用一个对象封装跟其他对象的交互,这使得交互可以独立变化
 *
 * Applicability
 * 适用场景
 *
 *      a set of objects communicate in well-defined but complex ways.
 *      和其他对象交互比较复杂
 *      reuse object is difficult because it refers to and communicates with many other objects.
 *      因为引用和交互对象比较多而导致难以重用
 *      a behavior that's distributed between several classes should be customizable without a lot of subclassing.
 *      一个致力于和其他类打交道的功能需要在不需要其他类的情况下自定义化
 *
 *  Consequences
 *  特点
 *
 *      it limits subclassing
 *      改变交互不需要使用继承
 *      it decouples colleagues
 *      交互对象解耦
 *      it simplifies object protocols.
 *      简化对象的交互
 *      it abstracts how object cooperate.
 *      隐藏了对象的交互
 *      it centralizes control.
 *      中心化交互
 *
 */
public class Mediator {
}
