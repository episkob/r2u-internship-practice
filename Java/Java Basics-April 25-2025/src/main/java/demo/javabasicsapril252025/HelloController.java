// Controller class for handling UI actions
package demo.javabasicsapril252025;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    // Reference to label in the FXML file
    @FXML
    private Label welcomeText;

    // Method called when the button is clicked (bound in FXML)
    @FXML
    protected void onHelloButtonClick () {
        welcomeText.setText
                ("Welcome to JavaFX Application!");
    }
}
