package co.edu.uniquindio.mediatorejemplo.mediator;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {

        MediatorChatImpl mediador = new MediatorChatImpl();

        TextArea areaChat = new TextArea();
        areaChat.setEditable(false);

        TextField campoMensaje = new TextField();
        campoMensaje.setPromptText("Escribe tu mensaje aquí");

        Button botonEnviar = new Button("Enviar");
        botonEnviar.setOnAction(event -> {
            String mensaje = campoMensaje.getText();
            if (!mensaje.isEmpty()) {
                areaChat.appendText("Tú: " + mensaje + "\n");
                campoMensaje.clear();
                mediador.enviarMensaje(new UsuarioChat(mediador, "Usuario", areaChat), mensaje);
            }
        });

        VBox root = new VBox(areaChat, campoMensaje, botonEnviar);
        Scene scene = new Scene(root, 400, 300);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Aplicación de Chat");
        primaryStage.show();


        // Agregar usuarios al mediador

        mediador.agregarUsuario(new UsuarioChat(mediador, "Usuario 1", areaChat));
        mediador.agregarUsuario(new UsuarioChat(mediador, "Usuario 2", areaChat));
        mediador.agregarUsuario(new UsuarioChat(mediador, "Usuario 3", areaChat));
    }


    public static void main(String[] args) {
        launch();
    }
}