package application;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextField;

public class Controller{

    ToDoList_Model model;

    ObservableList<String> content;

    public Controller (){
        model = new ToDoList_Model();
        content = FXCollections.observableArrayList(model.getList());
    }

    @FXML
    private TextField taskField;

    @FXML
    private ListView<String> tasksList;

    @FXML
    void addTask(ActionEvent event) {
        Task<String> task = new Task<>(taskField.getText());
        model.addTask(task.getTask()+"\t\t "+task.getDate());
        content = FXCollections.observableArrayList(model.getList());
        tasksList.setItems(content);
        taskField.setText("");
    }

    @FXML
    void deleteTask(ActionEvent event) {
        tasksList.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        content.remove(tasksList.getSelectionModel().getSelectedItem());
        model.getList().remove(tasksList.getSelectionModel().getSelectedItem());
    }

}