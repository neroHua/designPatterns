package chapter04.bridge.old.better01;

public abstract class AbstractShape implements Graph {
    
    protected Color color;
    
    public AbstractShape(Color color) {
        this.color = color;
    }

}