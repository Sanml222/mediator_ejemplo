package co.edu.uniquindio.mediatorejemplo.mediator;
import java.util.ArrayList;
import java.util.List;

public class MediatorChatImpl implements  MediatorChat{
    private List<Usuario> usuarios;

    public MediatorChatImpl() {
        this.usuarios = new ArrayList<>();
    }

    public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    @Override
    public void enviarMensaje(Usuario usuario, String mensaje) {
        for (Usuario u : usuarios) {
            if (u != usuario) {
                u.recibir(mensaje);
            }
        }
    }
}


