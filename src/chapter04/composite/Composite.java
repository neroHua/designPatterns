package chapter04.composite;

/**
 * composite
 * 组合模式
 *
 * Intent
 * 意图
 *      compose objects into tree structures to represent part-whole hierarchies.
 *      组合对象成为一颗树为了呈现部分和整体的垂直关系
 *      composite lets clients treat individual and compositions of objects uniformly.
 *      组合模式允许客户端统一处理单个对象和对象的组合
 *
 *
 * Applicability
 * 适用场景
 *
 *      you want to represent part-whole hierarchies of objects.
 *      你想呈现部分-整体关系的对象
 *      you want clients to be able to ignore the difference between compositions of objects
 *      and individual objects. clients will treat all objects in the composite structure uniformly.
 *      你想客户端忽略对象的间的不同，统一的处理他们
 *
 *  Consequences
 *  特点
 *
 *      defines class hierarchies consisting of primitive objects and composite objects.
 *      定义了具有继承关系的类，且对象有初级对象和组合对象
 *      makes client simple.
 *      使得客户端简单
 *      makes it easier to add new kinds of components.
 *      使得添加新的对象简单
 *      can make your design overly general
 *      可以使你的设计更加通用
 *
 *  Implements
 *  实现
 *
 *      explicit parent reference
 *      显式的父引用
 *      sharing components
 *      共享对象
 *      maximizing the component interface
 *      最大化对象的接口
 *      declaring the child management operation
 *      定义管理子对象的操作
 *      should component implement a list of components?
 *      对象是否可以具有列表
 *      child ordering
 *      子顺序
 *      caching to improve performance
 *      使用缓存提升性能
 *      who should delete components
 *      考虑对象的删除,尤其是垃圾回收方面
 *      what's the best data structure for storing components
 *      考虑装载对象的数据结构
 *
 *
 */
public class Composite {
}
