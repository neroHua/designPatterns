package chapter09.better01;

public abstract class AbstractShape implements Graph {
    
    protected Color color;
    
    public AbstractShape(Color color) {
        this.color = color;
    }

}