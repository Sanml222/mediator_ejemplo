package co.edu.uniquindio.mediatorejemplo.mediator;
import javafx.scene.control.TextArea;

public class UsuarioChat extends Usuario {
    public UsuarioChat(MediatorChat mediador, String nombre, TextArea areaChat) {
        super(mediador, nombre, areaChat);
    }

    @Override
    public void enviar(String mensaje) {
        areaChat.appendText("Tú: " + mensaje + "\n");
        mediador.enviarMensaje(this, mensaje);
    }

    @Override
    public void recibir(String mensaje) {
        areaChat.appendText(nombre + ": " + mensaje + "\n");
    }
}
