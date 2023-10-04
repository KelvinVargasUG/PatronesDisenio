package Creacionales.AbstractFactory.Fabrica;

import Creacionales.AbstractFactory.Producto.Button;
import Creacionales.AbstractFactory.Producto.CheckBox;

public interface GuiFactory {
    public Button createButton();
    public CheckBox createCheckBox();
}
