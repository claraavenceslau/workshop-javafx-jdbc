module workshop_javafx_javadbc {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;

    opens gui to javafx.fxml;          
    opens application to javafx.fxml; 
    
    exports gui;
    exports application;}