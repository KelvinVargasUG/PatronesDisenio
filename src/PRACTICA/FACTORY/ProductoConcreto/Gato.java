package PRACTICA.FACTORY.ProductoConcreto;

import PRACTICA.FACTORY.Producto.Animal;

public class Gato implements Animal {
    @Override
    public void moverse() {
        System.out.println("El gato se mueve");
    }

    @Override
    public void comer() {
        System.out.println("El gato come");
    }

    @Override
    public void dormir() {
        System.out.println("El gato duerme");
    }

    @Override
    public void hacerRuido() {
        System.out.println("El gato hace ruido");
    }
}
