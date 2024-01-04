module pbo.ditorifadli.travoway {
    requires javafx.controls;
    requires javafx.fxml;

    opens pbo.ditorifadli.travoway to javafx.fxml;
    exports pbo.ditorifadli.travoway;
}
