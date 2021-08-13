package chapter02.data;

import chapter02.data.iterator.Iterator;
import chapter02.os.Window;

public interface Glyph {

    void draw(Window window);

    boolean intersects(Point point);

    void insert(Glyph glyph, int index);

    void remove(Glyph glyph);

    Glyph child(int index);

    Glyph parent();

    // todo add iterator method
//    Iterator createIterator();

    // todo add accept method
//    void accept();

}
