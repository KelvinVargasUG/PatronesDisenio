package Creacionales.Factory.CreadorConcreto;

import Creacionales.Factory.Creador.Dialog;
import Creacionales.Factory.Producto.Button;
import Creacionales.Factory.ProductoConcreto.AndroidButton;

public class AndroidDialog extends Dialog
{

    @Override
    public Button createButton() {
        return new AndroidButton();
    }
}
