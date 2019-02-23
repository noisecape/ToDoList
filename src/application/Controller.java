package application;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class Controller{

    @FXML
    private TextField taskField;

    @FXML
    private ListView<String> tasksList;

    @FXML
    void addTask(ActionEvent event) {
        String taskText = taskField.getText();
        System.out.printf("Task: %s\n", taskText);
    }

    @FXML
    void deleteTask(ActionEvent event) {
        System.out.println("DELETE TASK");
    }

}