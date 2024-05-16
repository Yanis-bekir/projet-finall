module fr.insa.bekir.projet_final {
    requires javafx.controls;
    requires javafx.fxml;

    opens fr.insa.bekir.projet_final to javafx.fxml;
    exports fr.insa.bekir.projet_final;
}
