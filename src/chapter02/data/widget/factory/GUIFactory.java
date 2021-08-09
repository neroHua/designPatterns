package chapter02.data.widget.factory;

import chapter02.data.widget.Button;
import chapter02.data.widget.Menu;
import chapter02.data.widget.ScrollBar;

public interface GUIFactory {

    Button createButton();

    Menu createMenu();

    ScrollBar createScrollBar();

}
