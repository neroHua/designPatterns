package chapter02.data.widget.factory;

import chapter02.data.widget.Button;
import chapter02.data.widget.Menu;
import chapter02.data.widget.ScrollBar;
import chapter02.data.widget.pm.PMButton;
import chapter02.data.widget.pm.PMMenu;
import chapter02.data.widget.pm.PMScrollBar;

public class PMGUIFactory implements GUIFactory{

    @Override
    public Button createButton() {
        return new PMButton();
    }

    @Override
    public Menu createMenu() {
        return new PMMenu();
    }

    @Override
    public ScrollBar createScrollBar() {
        return new PMScrollBar();
    }

}
