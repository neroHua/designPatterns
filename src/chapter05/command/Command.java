package chapter05.command;

/**
 * command
 * 命令模式
 *
 * Also known as
 * 别称
 *      action, transaction
 *      包装模式
 *
 * Motivation
 * 动机
 *
 *      encapsulate a request as an object, thereby letting you parameterize clients with different request, and support undoable operations.
 *      把请求封装成一个对象,以此,来提供参数化客户端并且支持撤销操作
 *
 * Applicability
 * 适用场景
 *
 *      you want to reuse an existing class, ant its interface does not match the one you need
 *      你想使用一个已经存在的类,但是他的接口不满足现在需要
 *      parameterize objects by an action to perform
 *      根据要执行的命令来参数话一个对象
 *      specify, queue, and execute requests at different times.
 *      声明,保存,和执行请求在不同的时间
 *      support undo
 *      支持撤销
 *      support logging changes
 *      支持记录变化
 *      structure a system around high-level operations built on primitives operations
 *      用初级操作组合成高级操作的方式来构建一个系统
 *
 *  Consequences
 *  特点
 *
 *      pluggable adapters: a class is more reusable when you minimize the assumptions other class must make to use it
 *      插件适配：类越小越有助于适配
 *      using two-way adapters to provide transparency: class adapter and object adapter
 *      有两种方式提供使用:类适配器和对象适配器
 *      command decouple the object that invoke the operation from the one that knows how to perform it.
 *      解耦发出指令者和接收指令者
 *      you can assemble commands into a composite command
 *      你可以组合指令
 *      it's easy to add new commands
 *      他比较容易去新增新的指令
 *
 */
public class Command {
}
