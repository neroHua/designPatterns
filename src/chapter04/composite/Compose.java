package chapter04.composite;

import java.util.List;

public class Compose implements Component {

    List<Component> childList;

    @Override
    public void operation() {
        for (Component child : childList) {
            child.operation();
        }
    }

    @Override
    public void addChild(Component component) {
    }

    @Override
    public void removeChild(Component component) {
    }

    @Override
    public void getChild(Component component) {
    }

}
