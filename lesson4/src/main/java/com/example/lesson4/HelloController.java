package com.example.lesson4;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class HelloController {
    @FXML
    private TextField textField;
    @FXML
    private Button sendButton;
    @FXML
    private TextArea textArea;
    @FXML
    public ListView<String> userList;

    public void sendMessage() {
        if (!textField.getText().isEmpty()) {
            textArea.appendText(textField.getText());
            textArea.appendText(System.lineSeparator());
            textField.clear();
        }
    }
}
