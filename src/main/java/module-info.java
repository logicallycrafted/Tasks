module org.example.tasklist {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens org.example.tasklist to javafx.fxml;
    exports org.example.tasklist;
}