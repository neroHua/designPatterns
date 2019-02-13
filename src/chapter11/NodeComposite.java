package chapter11;

import java.util.ArrayList;
import java.util.List;

public class NodeComposite implements NodeComponent {
    
    List<NodeComponent> nodeList = new ArrayList<>();

    @Override
    public void addNode(NodeComponent node) {
        this.nodeList.add(node);
    }

    @Override
    public void removeNode(NodeComponent node) {
        this.nodeList.remove(node);
    }

    @Override
    public void showMyself() {
        for (NodeComponent node : nodeList) {
            node.showMyself();
        }
    }

}
