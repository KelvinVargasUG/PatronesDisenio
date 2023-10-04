package Creacionales.Factory.CreadorConcreto;

import Creacionales.Factory.Creador.Dialog;
import Creacionales.Factory.Producto.Button;
import Creacionales.Factory.ProductoConcreto.HtmlButton;

public class HtmlDialog extends Dialog {
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
