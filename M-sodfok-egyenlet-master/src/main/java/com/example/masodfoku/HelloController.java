package com.example.masodfoku;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class HelloController {




    @FXML
    private TextField aField;

    @FXML
    private TextField bField;

    @FXML
    private TextField cField;

    @FXML
    private Label resultLabel;

    @FXML
    public void calculate() {
        try {
            double a = Double.parseDouble(aField.getText());
            double b = Double.parseDouble(bField.getText());
            double c = Double.parseDouble(cField.getText());

            if (a == 0) {
                resultLabel.setText("Az 'a' értéke nem lehet nulla!");
                return;
            }

            double discriminant = b * b - 4 * a * c;

            if (discriminant < 0) {
                resultLabel.setText("Nem oldható meg a valós számok halmazán");
            } else if (discriminant == 0) {
                double x = -b / (2 * a);
                resultLabel.setText("x1 = x2 = " + x);
            } else {
                double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                resultLabel.setText("x1 = " + x1 + ", x2 = " + x2);
            }
        } catch (NumberFormatException e) {
            resultLabel.setText("Kérlek, csak számokat adj meg minden mezőben!");
        }
    }
}
