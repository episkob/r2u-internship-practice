module demo.javabasicsapril252025 {
    requires javafx.controls;
    requires javafx.fxml;


    opens demo.javabasicsapril252025 to javafx.fxml;
    exports demo.javabasicsapril252025;
}