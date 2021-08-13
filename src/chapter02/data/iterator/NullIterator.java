package chapter02.data.iterator;

import chapter02.data.Glyph;

public class NullIterator implements Iterator {

    @Override
    public Glyph first() {
        return null;
    }

    @Override
    public Glyph next() {
        return null;
    }

    @Override
    public boolean isDone() {
        return true;
    }

    @Override
    public Glyph currentItem() {
        return null;
    }

}
