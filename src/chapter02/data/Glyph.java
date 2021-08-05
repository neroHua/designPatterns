package chapter02.data;

public interface Glyph {

    void draw(Window window);

    void intersects(Point point);

    void insert(Glyph glyph, int type);

}
