package chapter02.data.widget;

import chapter02.command.Command;
import chapter02.data.Glyph;
import chapter02.data.Point;
import chapter02.os.Window;

public abstract class Menu implements Glyph {

    private Command command;

    @Override
    public void draw(Window window) {

    }

    @Override
    public boolean intersects(Point point) {
        return false;
    }

    @Override
    public void insert(Glyph glyph, int index) {

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

    public abstract void popUp();

    public abstract void popDown();

    public void click() {
        command.execute();
    }
}
