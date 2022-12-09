package oop.inheritance.terminal.ingenico;

import oop.inheritance.terminal.Display;
import oop.library.ingenico.services.IngenicoDisplay;

public class DisplayAdapter implements Display {
    private IngenicoDisplay ingenicoDisplay;


    public void showMessage(int x, int y, String text) {
        ingenicoDisplay.showMessage(x, y,text);
    }


    public DisplayAdapter(){
        this.ingenicoDisplay = new IngenicoDisplay();
    }


    public void clear() {
        ingenicoDisplay.clear();
    }
}
