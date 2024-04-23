module co.edu.uniquindio.mediatorejemplo.mediator {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.mediatorejemplo.mediator to javafx.fxml;
    exports co.edu.uniquindio.mediatorejemplo.mediator;
}