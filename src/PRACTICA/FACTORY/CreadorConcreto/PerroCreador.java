package PRACTICA.FACTORY.CreadorConcreto;

import PRACTICA.FACTORY.Creador.AnimalCreador;
import PRACTICA.FACTORY.Producto.Animal;
import PRACTICA.FACTORY.ProductoConcreto.Perro;

public class PerroCreador extends AnimalCreador {
    @Override
    public Animal crearAnimal() {
        return new Perro();
    }
}
