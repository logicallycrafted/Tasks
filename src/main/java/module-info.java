module org.example.tasklist {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.tasklist to javafx.fxml;
    exports org.example.tasklist;
}