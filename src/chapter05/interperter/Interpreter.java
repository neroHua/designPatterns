package chapter05.interperter;
/**
 * interpreter
 * 解释器模式
 *
 * Motivation
 * 动机
 *
 *      use objects to represent a grammar rule, finally become an abstract syntax tree
 *      使用对象来呈现一个语法规则，这些语法最终会被组装成一颗抽象语法树
 *
 * Applicability
 * 适用场景
 *
 *      when the statements can be representation as abstract syntax tree.
 *      当语句可以呈现成一个抽象语法树
 *
 *  Consequences
 *  特点
 *
 *      it's easy to change and extend the grammar.
 *      比较容易改变和继承语法
 *      it's easy to implement grammar.
 *      比较容易实现语法
 *      complex grammars are hard to maintain.
 *      复杂的语法不适宜使用这个方法
 *      work fine with visitor pattern.
 *      能和访问者模式很好的合作
 *
 */
public class Interpreter {
}
