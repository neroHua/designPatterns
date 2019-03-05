package chapter09.better02;

public class GraphImpl implements Graph {

    private Color color;
    private Shape shape;
    
    public GraphImpl(Color color, Shape shape) {
        this.color = color;
        this.shape = shape;
    }

    @Override
    public void show() {
        color.show();
        shape.show();
    }
    
}
