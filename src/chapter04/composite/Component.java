package chapter04.composite;

public interface Component {

    void operation();

    void addChild(Component component);

    void removeChild(Component component);

    void getChild(Component component);

}
