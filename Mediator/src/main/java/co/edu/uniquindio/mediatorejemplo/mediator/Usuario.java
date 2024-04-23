package co.edu.uniquindio.mediatorejemplo.mediator;
import javafx.scene.control.TextArea;



public abstract class Usuario {
    protected MediatorChat mediador;
    protected String nombre;
    protected TextArea areaChat;

    public Usuario(MediatorChat mediador, String nombre, TextArea areaChat) {
        this.mediador = mediador;
        this.nombre = nombre;
        this.areaChat = areaChat;
    }

    public abstract void enviar(String mensaje);

    public abstract void recibir(String mensaje);
}


