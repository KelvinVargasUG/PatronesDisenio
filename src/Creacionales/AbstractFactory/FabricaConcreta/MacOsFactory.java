package Creacionales.AbstractFactory.FabricaConcreta;

import Creacionales.AbstractFactory.Fabrica.GuiFactory;
import Creacionales.AbstractFactory.Producto.Button;
import Creacionales.AbstractFactory.Producto.CheckBox;
import Creacionales.AbstractFactory.ProductoConcreto.Buttons.MacButton;
import Creacionales.AbstractFactory.ProductoConcreto.CheckBox.MacCheckBox;

public class MacOsFactory implements GuiFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MacCheckBox();
    }
}
