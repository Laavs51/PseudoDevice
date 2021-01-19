package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller {
    @FXML
    private Button btn1;
    @FXML
    private Button btn2;
    @FXML
    private Button btn3;
    @FXML
    private Button btn4;
    @FXML
    private Button btn5;
    @FXML
    private Button btn6;
    @FXML
    private Button btn7;
    @FXML
    private Button btn8;
    @FXML
    private Button btn9;
    @FXML
    private Button btn0;
    @FXML
    private Label field;


    @FXML
    private void click(ActionEvent event) {
        switch (event.getSource().toString()) {
            case ("Button[id=btn1, styleClass=button clickBtn]'1'"):
                field.setText("1");
                break;
            case ("Button[id=btn2, styleClass=button clickBtn]'2'"):
                field.setText("2");
                break;
            case ("Button[id=btn3, styleClass=button clickBtn]'3'"):
                field.setText("3");
                break;
            case ("Button[id=btn4, styleClass=button clickBtn]'4'"):
                field.setText("4");
                break;
            case ("Button[id=btn5, styleClass=button clickBtn]'5'"):
                field.setText("5");
                break;
            case ("Button[id=btn6, styleClass=button clickBtn]'6'"):
                field.setText("6");
                break;
            case ("Button[id=btn7, styleClass=button clickBtn]'7'"):
                field.setText("7");
                break;
            case ("Button[id=btn8, styleClass=button clickBtn]'8'"):
                field.setText("8");
                break;
            case ("Button[id=btn9, styleClass=button clickBtn]'9'"):
                field.setText("9");
                break;
            default:
                field.setText("0");
                break;
        }
    }
}
