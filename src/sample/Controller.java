package sample;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Controller {
    @FXML
    public TextField textField;
    @FXML
    public TextArea textArea;
    @FXML
    public Button btn1;

    private Stage stage;


    @FXML
    public void sendMsg(ActionEvent actionEvent) {
        textArea.appendText(textField.getText() + "\n");
        textField.clear();
        textField.requestFocus();
    }

    public void clickClose(ActionEvent actionEvent) {
        Platform.runLater(()->{
            stage = (Stage) btn1.getScene().getWindow();
            stage.close();
        });
    }
}
