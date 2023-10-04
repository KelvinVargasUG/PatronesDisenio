package Creacionales.AbstractFactory;

import Creacionales.AbstractFactory.Fabrica.GuiFactory;
import Creacionales.AbstractFactory.Producto.Button;
import Creacionales.AbstractFactory.Producto.CheckBox;

public class Cliente {
    private Button button;
    private CheckBox checkBox;

    public Cliente(GuiFactory factory) {
        button = factory.createButton();
        checkBox = factory.createCheckBox();
    }

    public void paint() {
        button.paint();
        checkBox.paint();
    }
}
