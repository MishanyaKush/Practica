package sample;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class Controller {
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button monthButton;
    @FXML
    private TextField xField;

    @FXML
    private TextField yField;

    @FXML
    private TextField zField;

    @FXML
    private Label labelRes;

    @FXML
    void ChangeButtonClick(MouseEvent event) {
        if (xField.getText() != "" && yField.getText() != "" && zField.getText() != "")
        labelRes.setText("A = " + Math.round((Math.sqrt(Math.pow(Integer.parseInt(xField.getText()),2)*Integer.parseInt(yField.getText()))-14*Integer.parseInt(zField.getText()))));
    }
}
