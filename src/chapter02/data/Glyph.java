package chapter02.data;

public interface Glyph {

    void draw(Window window);

    boolean intersects(Point point);

    void insert(Glyph glyph, int index);

    void remove(Glyph glyph);

    Glyph child(int index);

    Glyph parent();

}
