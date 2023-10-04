package Creacionales.Factory.ProductoConcreto;

import Creacionales.Factory.Producto.Button;

public class HtmlButton implements Button {
    @Override
    public void render(String text) {
        System.out.println("HtmlButton: " + text);
    }

    @Override
    public void onClick() {
        System.out.println("Click! HtmlButton");
    }
}
