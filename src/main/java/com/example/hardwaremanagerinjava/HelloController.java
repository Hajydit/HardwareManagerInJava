package com.example.hardwaremanagerinjava;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import oshi.SystemInfo;
import oshi.software.os.OperatingSystem;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("bs");
    }
}