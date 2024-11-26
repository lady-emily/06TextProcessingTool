module com.example.textprocessingtool {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;

    opens com.example.textprocessingtool to javafx.fxml;
    exports com.example.textprocessingtool;

    opens com.example.textprocessingtool.ui to javafx.fxml;
    exports com.example.textprocessingtool.ui to javafx.fxml, javafx.graphics;

}