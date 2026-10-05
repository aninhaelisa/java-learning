package gui;

import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;

public class ViewController {

    @FXML
    private Button btClick;

    @FXML
    public void onBtClick() {
        Alerts.showAlert("Alert Title", "Alert Header", "This is the alert content.", AlertType.INFORMATION);
    }
}