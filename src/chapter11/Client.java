package chapter11;

/**
 * 
 * 组合模式(composite)
 * 
 * 高层对于某个对象操作，同时递归地操作了其他一系列相关的对象，同时其他一系列相关的对象的类型可以不一样
 * 
 * @author 滑德友
 * @time 2019年2月13日10:53:44
 *
 */
public class Client {

    public static void main(String[] args) {
        NodeA nodeA1 = new NodeA();
        NodeB nodeB1 = new NodeB();
        NodeComposite nodeComposite1 = new NodeComposite();
        nodeComposite1.addNode(nodeA1);
        nodeComposite1.addNode(nodeB1);

        NodeA nodeA2 = new NodeA();
        NodeB nodeB2 = new NodeB();
        NodeComposite nodeComposite2 = new NodeComposite();
        nodeComposite2.addNode(nodeA2);
        nodeComposite2.addNode(nodeB2);
        nodeComposite2.addNode(nodeComposite1);
        
        nodeComposite2.showMyself();
    }

}