package chapter02.data.widget.factory;

import chapter02.data.widget.Button;
import chapter02.data.widget.Menu;
import chapter02.data.widget.ScrollBar;
import chapter02.data.widget.mac.MacButton;
import chapter02.data.widget.mac.MacMenu;
import chapter02.data.widget.mac.MacScrollBar;

public class MacGUIFactory implements GUIFactory{

    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Menu createMenu() {
        return new MacMenu();
    }

    @Override
    public ScrollBar createScrollBar() {
        return new MacScrollBar();
    }

}
