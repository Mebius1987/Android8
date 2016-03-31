package hw15;


import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;

import java.net.URL;
import java.text.NumberFormat;
import java.util.ResourceBundle;


public class Controller implements Initializable {

    @FXML
    Slider sliderTrack;

    @FXML
    Label feild;

    private static final double INIT_VALUE = 50;

    @Override
    public void initialize(URL location, ResourceBundle resourse) {
        sliderTrack.setValue(INIT_VALUE);
        feild.setText(new Double(INIT_VALUE).toString());
        feild.textProperty().bindBidirectional(sliderTrack.valueProperty(), NumberFormat.getNumberInstance());
    }

}