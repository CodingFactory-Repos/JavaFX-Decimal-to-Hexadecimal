module me.loule.decimaltohexadecimal {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens me.loule.decimaltohexadecimal to javafx.fxml;
    exports me.loule.decimaltohexadecimal;

    exports me.loule.decimaltohexadecimal.controller;
    opens me.loule.decimaltohexadecimal.controller to javafx.fxml;

    exports me.loule.decimaltohexadecimal.model;
    opens me.loule.decimaltohexadecimal.model to javafx.fxml;
}