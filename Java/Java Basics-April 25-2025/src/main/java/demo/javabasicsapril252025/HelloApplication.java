// Main JavaFX application class
package demo.javabasicsapril252025;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    @Override
    public void start (Stage stage) throws IOException {
        // Load FXML UI layout
        FXMLLoader fxmlLoader = new FXMLLoader
                (HelloApplication.class.getResource
                        ("hello-view.fxml"));
        // Create a new scene with specified dimensions
        Scene scene = new Scene
                (fxmlLoader.load (), 320, 240);

        // Set the window title and show the stage
        stage.setTitle ("Hello!");
        stage.setScene (scene);
        stage.show ();
    }

    public static void main (String[] args) {
        // Launch the JavaFX application
        launch ();
    }
}
