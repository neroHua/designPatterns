package chapter02.data.widget.factory;

import chapter02.data.widget.Button;
import chapter02.data.widget.Menu;
import chapter02.data.widget.ScrollBar;
import chapter02.data.widget.motif.MotifButton;
import chapter02.data.widget.motif.MotifMenu;
import chapter02.data.widget.motif.MotifScrollBar;

public class MotifGUIFactory implements GUIFactory{

    @Override
    public Button createButton() {
        return new MotifButton();
    }

    @Override
    public Menu createMenu() {
        return new MotifMenu();
    }

    @Override
    public ScrollBar createScrollBar() {
        return new MotifScrollBar();
    }

}
