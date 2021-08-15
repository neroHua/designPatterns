package chapter02.data;

import chapter02.data.iterator.Iterator;
import chapter02.data.iterator.ListIterator;
import chapter02.data.visitor.Visitor;
import chapter02.format.Format;
import chapter02.os.Window;

public class Rectangle implements Glyph {

    private Format format;

    private Point point1;

    private Point point2;

    public Rectangle(Format format) {
        this.format = format;
    }

    @Override
    public void draw(Window window) {
        window.drawRectangle(this);
    }

    @Override
    public boolean intersects(Point point) {
        return false;
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
        return new ListIterator();
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitRectangle(this);
    }

    public Point getPoint1() {
        return point1;
    }

    public void setPoint1(Point point1) {
        this.point1 = point1;
    }

    public Point getPoint2() {
        return point2;
    }

    public void setPoint2(Point point2) {
        this.point2 = point2;
    }
}
