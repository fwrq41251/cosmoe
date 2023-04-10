module org.winry.cosmoe {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens org.winry.cosmoe to javafx.fxml;
    exports org.winry.cosmoe;
}