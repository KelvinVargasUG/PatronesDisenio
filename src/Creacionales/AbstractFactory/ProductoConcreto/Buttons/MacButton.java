package Creacionales.AbstractFactory.ProductoConcreto.Buttons;

import Creacionales.AbstractFactory.Producto.Button;

public class MacButton implements Button {
    @Override
    public void paint() {
        System.out.println("You have created MacButton.");
    }
}
