package PRACTICA.FACTORY.CreadorConcreto;

import PRACTICA.FACTORY.Creador.AnimalCreador;
import PRACTICA.FACTORY.Producto.Animal;
import PRACTICA.FACTORY.ProductoConcreto.Gato;

public class GatoCreador extends AnimalCreador {
    @Override
    public Animal crearAnimal() {
        return new Gato();
    }
}
