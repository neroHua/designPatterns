package chapter04.composite.old;

public class NodeB implements NodeComponent {

    @Override
    public void addNode(NodeComponent node) {
        System.out.println("不支持的操作");
    }

    @Override
    public void removeNode(NodeComponent node) {
        System.out.println("不支持的操作");
    }

    @Override
    public void showMyself() {
        System.out.println("我的类型是：NodeB");
    }

}
