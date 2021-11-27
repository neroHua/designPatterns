package chapter04.proxy;

/**
 * proxy
 * 代理模式
 *
 * Also known as
 * 别称
 *      surrogate
 *      代理模式
 *
 * Intent
 * 意图
 *      provide a surrogate or placeholder for another object to control access to it.
 *      为另外一个对象提供代理或者占位符以控制对象的访问
 *
 * Applicability
 * 适用场景
 *
 *      proxy is applicable whenever there is a need for a more versatile or sophisticated reference to an object than a simple pointer
 *      代理模式适用于任何需要一个功能全面且复杂的引用而不是仅仅一个指针的场景
 *      a remote proxy provide a local representative for an object in a different address space.
 *      一个远程的代理提供了一个本地对象来使用远程对象
 *      a virtual proxy create expensive objects on demand.
 *      一个虚拟的代理按需创建复杂对象
 *      a protection proxy controls access to the original object.
 *      一个保护的代理控制对象的访问
 *      a smart reference that performs additional actions like counting reference number, loading, check lock
 *      一个聪明的引用用来执行额外的动作，比如：引用计数，装载，检查锁
 *
 *  Consequences
 *  特点
 *
 *      the proxy pattern introduces a level of indirection when accessing an object
 *      代理模式提供了一种间接访问对象的方式
 *
 */
public class Proxy {
}
