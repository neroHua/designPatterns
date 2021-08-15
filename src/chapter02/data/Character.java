package chapter02.data;

import chapter02.data.iterator.ArrayIterator;
import chapter02.data.iterator.Iterator;
import chapter02.data.visitor.Visitor;
import chapter02.format.Format;
import chapter02.os.Window;

public class Character implements Glyph {

    private char character;

    private Format format;

    public Character(char character, Format format) {
        this.character = character;
        this.format = format;
    }

    @Override
    public void draw(Window window) {
        window.drawCharacter(this);
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
        return new ArrayIterator();
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitCharacter(this);
    }

}
