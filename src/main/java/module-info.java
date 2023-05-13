module com.example.weltkare {
    requires javafx.controls;
    requires javafx.fxml;
            
        requires org.controlsfx.controls;
                        requires org.kordamp.bootstrapfx.core;
            
    opens com.example.weltkare to javafx.fxml;
    exports com.example.weltkare;
}