module workshop_javafx_javadbc {
	requires javafx.controls;
	
	opens application to javafx.graphics, javafx.fxml;
}
