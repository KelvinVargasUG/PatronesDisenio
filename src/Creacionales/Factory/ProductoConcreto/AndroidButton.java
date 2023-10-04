package Creacionales.Factory.ProductoConcreto;

import Creacionales.Factory.Producto.Button;

public class AndroidButton implements Button {
    @Override
    public void render(String text) {
        System.out.println("AndroidButton: " + text);
    }

    @Override
    public void onClick() {
        System.out.println("Click! AndroidButton");
    }
}
