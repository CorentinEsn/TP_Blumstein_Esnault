package com.example.tp_blumestein_esnault.AddSalle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import com.example.tp_blumestein_esnault.MainController;

import java.sql.SQLException;

public class AddSalleController {

    @FXML
    private TextField nameSalle=new TextField();
    MainController mainController = new MainController();
    @FXML
    public void AddSalle(ActionEvent actionEvent) throws SQLException {
        mainController.addSalleSelection(nameSalle.getText());
    }

}
