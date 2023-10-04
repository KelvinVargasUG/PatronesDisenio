package Creacionales.AbstractFactory.ProductoConcreto.CheckBox;

import Creacionales.AbstractFactory.Producto.CheckBox;

public class MacCheckBox implements CheckBox {
    @Override
    public void paint() {
        System.out.println("You have created MacCheckBox.");
    }
}
