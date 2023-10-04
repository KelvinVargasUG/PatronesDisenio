package Creacionales.Factory.CreadorConcreto;

import Creacionales.Factory.Creador.Dialog;
import Creacionales.Factory.Producto.Button;
import Creacionales.Factory.ProductoConcreto.LinuxButton;

public class LinuxDialog extends Dialog {
    @Override
    public Button createButton() {
        return new LinuxButton();
    }
}
