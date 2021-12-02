package me.loule.decimaltohexadecimal.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import me.loule.decimaltohexadecimal.model.HexadecimalToDecimal;
import me.loule.decimaltohexadecimal.model.DecimalToHexadecimal;

import java.net.URL;
import java.util.ArrayList;
import java.util.Objects;
import java.util.ResourceBundle;

public class MainController implements Initializable {
    @FXML
    private TextField textFieldDecimal;

    @FXML
    private TextField textFieldHexadecimal;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("MainController initialized");

        textFieldDecimal.setOnKeyReleased(event -> {
            if (!Objects.equals(textFieldDecimal.getText(), "")) {
                DecimalToHexadecimal decimalToHexadecimal = new DecimalToHexadecimal(Integer.parseInt(textFieldDecimal.getText()));

                textFieldHexadecimal.setText(decimalToHexadecimal.result());
            } else {
                textFieldHexadecimal.setText("");
            }
        });

        textFieldHexadecimal.setOnKeyReleased(event -> {
            if (!Objects.equals(textFieldHexadecimal.getText(), "")) {
                HexadecimalToDecimal hexadecimalToDecimal = new HexadecimalToDecimal(textFieldHexadecimal.getText());

                textFieldDecimal.setText(hexadecimalToDecimal.result());
            } else {
                textFieldDecimal.setText("");
            }
        });
    }

    public String convertDecimalToBinary(int num) {
        ArrayList<String> binary = new ArrayList<>();

        String result = "";

        while (num > 0) {
            binary.add(String.valueOf(num % 2));
            num = num / 2;
        }

        for (int i = binary.size() - 1; i >= 0; i--) {
            result += binary.get(i);
        }

        return result;
    }

    public String convertBinaryToDecimal(int num) {
        int result = 0;

        for (int i = 0; num != 0; i++) {
            result += (num % 10) * Math.pow(2, i);
            num = num / 10;
        }

        return Integer.toString(result);
    }
}