package Creacionales.AbstractFactory.FabricaConcreta;

import Creacionales.AbstractFactory.Fabrica.GuiFactory;
import Creacionales.AbstractFactory.Producto.Button;
import Creacionales.AbstractFactory.Producto.CheckBox;
import Creacionales.AbstractFactory.ProductoConcreto.Buttons.WinButton;
import Creacionales.AbstractFactory.ProductoConcreto.CheckBox.WinCheckBox;

public class WinFactory implements GuiFactory {
    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WinCheckBox();
    }
}
