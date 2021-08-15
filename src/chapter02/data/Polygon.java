package chapter02.data;

import chapter02.data.iterator.Iterator;
import chapter02.data.iterator.NullIterator;
import chapter02.data.visitor.Visitor;
import chapter02.format.Format;
import chapter02.os.Window;

public class Polygon implements Glyph {

    private Format format;

    public Polygon(Format format) {
        this.format = format;
    }

    @Override
    public void draw(Window window) {
        window.drawPolygon(this);
    }

    @Override
    public boolean intersects(Point point) {
        return true;
    }

    @Override
    public void insert(Glyph glyph, int index) {
        format.format();
    }

    @Override
    public void remove(Glyph glyph) {

    }

    @Override
    public Glyph child(int index) {
        return null;
    }

    @Override
    public Glyph parent() {
        return null;
    }

    @Override
    public Iterator createIterator() {
        return new NullIterator();
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitPolygon(this);
    }

}
