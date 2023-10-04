import Creacionales.AbstractFactory.Cliente;
import Creacionales.AbstractFactory.Fabrica.GuiFactory;
import Creacionales.AbstractFactory.FabricaConcreta.MacOsFactory;
import Creacionales.AbstractFactory.FabricaConcreta.WinFactory;
import Creacionales.Factory.Creador.Dialog;
import Creacionales.Factory.CreadorConcreto.AndroidDialog;
import Creacionales.Factory.CreadorConcreto.FlutterDialog;
import Creacionales.Factory.CreadorConcreto.LinuxDialog;

public class Main {

    public static void main(String[] args) {

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

    private static Cliente ABSTRACT_FACTORY(){
        Cliente cli;
        GuiFactory fabrica;
        fabrica = new WinFactory();
        fabrica = new MacOsFactory();
        cli = new Cliente(fabrica);
        return cli;
    }
}
