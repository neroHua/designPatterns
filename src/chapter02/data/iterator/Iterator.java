package chapter02.data.iterator;

import chapter02.data.Glyph;

public interface Iterator {

    Glyph first();

    Glyph next();

    boolean isDone();

    Glyph currentItem();

}
