package Creacionales.Factory.ProductoConcreto;

import Creacionales.Factory.Producto.Button;

public class FlutterButton implements Button {
    @Override
    public void render(String text) {
        System.out.println("FlutterButton: " + text);
    }

    @Override
    public void onClick() {
        System.out.println("Click! FlutterButton");
    }
}
