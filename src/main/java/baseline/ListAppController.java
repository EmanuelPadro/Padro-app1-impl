package baseline;

/*
 *  UCF COP3330 Summer 2021 Application Assignment 1 Solution
 *  Copyright 2021 Emanuel Padro
 */

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import java.util.List;

public class ListAppController {
    Operations operations = new Operations();

    @FXML
    public TextArea listTextBox;

    @FXML
    public TextField taskIDText;

    @FXML
    public TextField newDueDate;

    @FXML
    public TextField newDescription;

    @FXML
    public TextField taskDueDateText;

    @FXML
    public TextField taskDescriptionText;

    @FXML
    public Button clearList;

    @FXML
    private Button addTask;

    @FXML
    private Button allTasks;

    @FXML
    private Button editTask;

    @FXML
    private Button removeTask;

    @FXML
    void addTaskClicked(ActionEvent event) {
        String dueDate = taskDueDateText.getText();
        String desc = taskDescriptionText.getText();
        Task newTask = new Task(desc, dueDate);
        operations.addTasks(newTask);
        System.out.println("Testing");
        System.out.println(newTask.description + " " + newTask.dueDate);

    }

    @FXML
    void displayTasks(ActionEvent event) {
        List<String> listPrint;
        listPrint = operations.displayList();
        listTextBox.setText(String.valueOf(listPrint)
                .replace(",","")
                .replace("[","")
                .replace("]",""));
    }

    @FXML
    void editTaskClicked(ActionEvent event) {
        int taskID = Integer.parseInt(taskIDText.getText());
        String dueDate = newDueDate.getText();
        String desc = newDescription.getText();
        Task newTask = new Task(desc, dueDate);
        operations.editTask(taskID, newTask);
    }

    @FXML
    void removeTaskClicked(ActionEvent event) {
        int taskID = Integer.parseInt(taskIDText.getText());
        operations.deleteTask(taskID);
        System.out.print(taskID);
    }

    @FXML
    void clearList(ActionEvent event) {
        operations.clearList();
    }
}
