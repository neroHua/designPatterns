package chapter03.abstractFactory;

/**
 * abstract factory
 * 抽象工厂
 *
 * intent
 * 意图
 *      provide an interface for creating families or related or dependent objects without specifying their concrete classes
 *
 * Also Known As
 * 其他名称
 *      KIT
 *
 * Motivation
 * 动机
 *      easy to make products in one family, and easy to vary in family
 *      容易使产品属于同一家族，容易改变家族
 *
 * Applicability
 * 适用场景
 *
 *      a system should be independent of how its products are created, composed, and represented
 *      一个系统和它产品的创建组合表现形式独立开来
 *      a system should be configured with one of multiple families of products
 *      一个系统需要配置一个家族的产品
 *      a family of related product objects is designed to be used together, and you need to enforce this constraint
 *      一个家族的产品必须要一起使用，设计者要强制保证这一约束
 *      you want to provide a class library of products, and you want to reveal just their interfaces, not their implementations.
 *      你想创建一个产品库，而且你只想暴露接口而不是具体的实现类给调用者使用
 *
 *  Consequences
 *  特点
 *
 *      It isolates concrete classes.
 *      隔离了产品的具体实现
 *      It makes exchanging product families easy
 *      换一另外一套家族的产品非常容易, 新增一套家族也很容易
 *      It promotes consistency among products.
 *      促进了产品之间的一致性, 因为产品属于同一家族
 *      Supporting new kinds of products is difficult
 *      新增一种产品变的比较困难，因为需要在工厂接口新增创建该产品的方法
 *
 *  vary
 *  变种
 *
 *      abstract factory just has one method and take parameter to create different product
 *      抽象工厂仅有一个方法，该方法通过参数来区分需要创建什么样的产品
 *
 */
public class AbstractFactory {
}
