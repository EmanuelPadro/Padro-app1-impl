package baseline;

/*
 *  UCF COP3330 Summer 2021 Application Assignment 1 Solution
 *  Copyright 2021 Emanuel Padro
 */

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class ListAppController {
    @FXML
    public TextField taskDueDateText;
    @FXML
    public TextField taskDescriptionText;

    @FXML
    public Button clearList;

    @FXML
    public Button loadList;

    @FXML
    public Button createList;

    @FXML
    private Button addList;

    @FXML
    private Button addTask;

    @FXML
    private Button allTasks;

    @FXML
    private Button completeTasks;

    @FXML
    private Button displayAllList;

    @FXML
    private Button editTask;

    @FXML
    private Button editTitle;

    @FXML
    private TextField fileTextbox;

    @FXML
    private Button incompleteTasks;

    @FXML
    private Button markComplete;

    @FXML
    private Button removeList;

    @FXML
    private Button removeTask;

    @FXML
    private Button saveList;

    @FXML
    void saveListClicked(ActionEvent event) {
        //when savelist is clicked it should call a class which will go trough the process

    }

    @FXML
    void addTaskClicked(ActionEvent event) {
        String dueDate = taskDueDateText.getText();
        String desc = taskDescriptionText.getText();
        Task newtask = new Task(desc, dueDate);

        

    }

    @FXML
    void displayCompleteTasks(ActionEvent event) {
        //when displayCompleteTasks button is clicked it should call a class which will go trough the process
    }

    @FXML
    void displayIncompleteTasks(ActionEvent event) {
        //when displayIncompleteTasks is clicked it should call a class which will go trough the process
    }

    @FXML
    void displayTasks(ActionEvent event) {
        //when displayTasks is clicked it should call a class which will go trough the process
    }

    @FXML
    void editTaskClicked(ActionEvent event) {
        //when editTask is clicked it should call a class which will go trough the process
    }

    @FXML
    void markCompleteClicked(ActionEvent event) {
        //when markComplete is clicked it should call a class which will go trough the process
    }

    @FXML
    void removeTaskClicked(ActionEvent event) {
        //when removeTask is clicked it should call a class which will go trough the process
    }

    @FXML
    public void loadListClicked(ActionEvent actionEvent) {
        //will loadlist
    }

    @FXML
    Operations newListClicked(ActionEvent event) {
        Operations list = new Operations();
        return list;
    }

    @FXML
    void clearList(ActionEvent event) {
        //will clear memory
    }
}
