package Screens;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

public class HomeController {

    @FXML
    Label faceScan;

    @FXML
    ImageView green;
    @FXML
    ImageView red;

    @FXML
    public void readFace(ActionEvent cry) {
        faceScan.setVisible(false);
    }


}
