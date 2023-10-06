import Creacionales.AbstractFactory.Cliente;
import Creacionales.AbstractFactory.Fabrica.GuiFactory;
import Creacionales.AbstractFactory.FabricaConcreta.MacOsFactory;
import Creacionales.AbstractFactory.FabricaConcreta.WinFactory;
import Creacionales.Builder.Builders.CarBuilder;
import Creacionales.Builder.Builders.ManualBuilder;
import Creacionales.Builder.Cars.Car;
import Creacionales.Builder.Cars.Manual;
import Creacionales.Builder.Director.Director;
import Creacionales.Factory.Creador.Dialog;
import Creacionales.Factory.CreadorConcreto.AndroidDialog;
import Creacionales.Factory.CreadorConcreto.FlutterDialog;
import Creacionales.Factory.CreadorConcreto.LinuxDialog;
import PRACTICA.FACTORY.Creador.AnimalCreador;
import PRACTICA.FACTORY.CreadorConcreto.PerroCreador;
import PRACTICA.FACTORY.Producto.Animal;

public class Main {

    public static void main(String[] args) {

        BUILDER();
    }

    //CREACIONALES
    private static void FACTORY(){
        Dialog dialog;

        dialog = new AndroidDialog();
        dialog.render();

        dialog = new FlutterDialog();
        dialog.render();

        dialog = new LinuxDialog();
        dialog.render();
    }

    private static Animal CreardorAnimales(){
        AnimalCreador creador;

        creador = new PerroCreador();
       return creador.crear();
    }

    private static Cliente ABSTRACT_FACTORY(){
        Cliente cli;
        GuiFactory fabrica;
        fabrica = new WinFactory();
        fabrica = new MacOsFactory();
        cli = new Cliente(fabrica);
        return cli;
    }

    private static void BUILDER(){
        Director director = new Director();

        CarBuilder builder = new CarBuilder();

        director.constructSportCar(builder);

        Car car = builder.getResult();

        System.out.println(car.getType());

        ManualBuilder manualBuilder = new ManualBuilder();

        director.constructSportCar(manualBuilder);

        Manual carManual = manualBuilder.getResult();

        System.out.println(carManual.print());

    }
}
