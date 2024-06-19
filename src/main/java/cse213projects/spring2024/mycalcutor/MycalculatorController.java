package cse213projects.spring2024.mycalcutor;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MycalculatorController
{
    @javafx.fxml.FXML
    private TextField numbertwoTextField;
    @javafx.fxml.FXML
    private Label resultLabel;
    @javafx.fxml.FXML
    private TextField numberoneTextField;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void AddOnClick(ActionEvent actionEvent) {
        String numOne = numberoneTextField.getText();
        String numTwo = numbertwoTextField.getText();
        int num1 = Integer.parseInt(numOne);
        int num2 = Integer.parseInt(numTwo);
        int num3 = num1 + num2;
        String numThree = Integer.toString(num3);
        resultLabel.setText(numThree);
    }

    @javafx.fxml.FXML
    public void SubtractOnClick(ActionEvent actionEvent) {
        String numOne = numberoneTextField.getText();
        String numTwo = numbertwoTextField.getText();
        int num1 = Integer.parseInt(numOne);
        int num2 = Integer.parseInt(numTwo);
        int num3 = num1 - num2;
        String numThree = Integer.toString(num3);
        resultLabel.setText(numThree);

    }

    @javafx.fxml.FXML
    public void MultiplyonClick(ActionEvent actionEvent) {
        String numOne = numberoneTextField.getText();
        String numTwo = numbertwoTextField.getText();
        int num1 = Integer.parseInt(numOne);
        int num2 = Integer.parseInt(numTwo);
        int num3 = num1 * num2;
        String numThree = Integer.toString(num3);
        resultLabel.setText(numThree);
    }

    @javafx.fxml.FXML
    public void DivideOnAction(ActionEvent actionEvent) {
        String numOne = numberoneTextField.getText();
        String numTwo = numbertwoTextField.getText();
        float num1 = Float.parseFloat(numOne);
        float num2 = Float.parseFloat(numTwo);
        if (num2 == 0) {
            resultLabel.setText("Cannot divide by zero");
        }
        else {
            float num3 = num1 / num2;
            String numThree = Float.toString(num3);
            resultLabel.setText(numThree);
    }   }
}