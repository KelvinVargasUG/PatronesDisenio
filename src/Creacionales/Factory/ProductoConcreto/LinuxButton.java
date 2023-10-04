package Creacionales.Factory.ProductoConcreto;

import Creacionales.Factory.Producto.Button;

public class LinuxButton implements Button {
    @Override
    public void render(String text) {
        System.out.println("LinuxBotton: " + text);
    }

    @Override
    public void onClick() {
        System.out.println("Click! LinuxBotton");
    }
}
