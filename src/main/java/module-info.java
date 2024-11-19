module ies.losmontecillos.libretasfxml {
    requires javafx.controls;
    requires javafx.fxml;


    opens ies.losmontecillos.libretasfxml to javafx.fxml;
    exports ies.losmontecillos.libretasfxml;
}