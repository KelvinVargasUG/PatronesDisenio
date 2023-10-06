package PRACTICA.FACTORY.Creador;

import PRACTICA.FACTORY.Producto.Animal;

public abstract class AnimalCreador {
    public abstract Animal crearAnimal();

    public Animal crear(){
        Animal animal = crearAnimal();
        System.out.println("Se creo un animal");
        return animal;
    }
}
