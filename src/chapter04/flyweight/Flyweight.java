package chapter04.flyweight;

/**
 * flyweight
 * 享元模式
 *
 * Intent
 * 意图
 *      use sharing to support large numbers of fine-grained objects efficiently.
 *      使用共享去支持大量的细粒度对象的效率
 *
 *
 * Applicability
 * 适用场景
 *
 *      an application use a large number of objects.
 *      应用使用大量的对象
 *      storage costs are high because of the sheer quantity of objects.
 *      装载对象花费了很多成本因为大量的对象
 *      most object state can be made extrinsic.
 *      大多数对象的状态可以放在外部维护
 *      many groups of objects may be replaced by relatively few shared objects once extrinsic state is removed.
 *      许多对象组合可以用少量对象表示，一旦外部状态移除
 *      the application doesn't depend on object identity.
 *      应用不区分对象的不同
 *
 *
 *  Consequences
 *  特点
 *
 *      flyweight may save a lots of times.
 *      可以节省很多时间
 *
 *  Implements
 *  实现
 *
 *      keeping component classes lightweight
 *      确保父接口尽量轻量
 *      removing extrinsic state
 *      移除外部状态
 *      managing shared objects
 *      管理共享的对象
 *
 */
public class Flyweight {
}
