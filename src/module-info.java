module workshop_javafx_javadbc {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
	requires java.sql;

    opens gui to javafx.fxml;          
    opens application to javafx.graphics, javafx.fxml; 
    
    exports gui;
    exports application;
    opens model.entities to javafx.base;
}