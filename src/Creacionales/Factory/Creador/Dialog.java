package Creacionales.Factory.Creador;

import Creacionales.Factory.Producto.Button;

public abstract class Dialog {
    public abstract Button createButton();

    public void render() {
        Button okButton = createButton();
        okButton.render("OK");
        okButton.onClick();
    }
}
