package demo.demo;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

import java.util.Random;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) {
        // Initialize chart data with 3 sample entries
        ObservableList<PieChart.Data> data = FXCollections.observableArrayList(
                new PieChart.Data("Data 1", 10),
                new PieChart.Data("Data 2", 20),
                new PieChart.Data("Data 3", 30)
        );

        // Create "Add Data" button that appends new random data to the chart
        Button btn1 = new Button ("Add Data");
        btn1.setOnAction (event -> {
            data.add (new PieChart.Data ("Data" + (data.size ()+1),
                    10 + new Random ().nextInt (30)));
        });

        // Create "Delete Data" button that removes a random data entry if list is not empty
        Button btn2 = new Button ("Delete data");
        btn2.setOnAction ((event) ->{
            if(!data.isEmpty ())
                data.remove (new Random ().nextInt (data.size ()));
        });

        // Create PieChart with the provided data list
        PieChart pie = new PieChart(data);
        pie.setTitle("Demo Chart");

        // Set up the UI layout using FlowPane
        FlowPane root = new FlowPane();
        root.getChildren ().add (btn1);
        root.getChildren ().add (btn2);
        root.getChildren ().add (pie);

        // Create scene and show stage
        Scene scene = new Scene(root, 450, 500);

        stage.setTitle("Data demo");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        // Launch the JavaFX application
        launch();
    }
}
