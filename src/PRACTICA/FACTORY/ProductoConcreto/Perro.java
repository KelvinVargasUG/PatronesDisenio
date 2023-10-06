package PRACTICA.FACTORY.ProductoConcreto;

import PRACTICA.FACTORY.Producto.Animal;

public class Perro implements Animal {
    @Override
    public void moverse() {
        System.out.println("El perro se mueve");
    }

    @Override
    public void comer() {
        System.out.println("El perro come");
    }

    @Override
    public void dormir() {
        System.out.println("El perro duerme");
    }

    @Override
    public void hacerRuido() {
        System.out.println("El perro ladra");
    }
}
