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
    Operations operations = new Operations();

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
        //when saveList is clicked it should call a class which will go trough the process
    }

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
    void displayCompleteTasks(ActionEvent event) {
        //when displayCompleteTasks button is clicked it should call a class which will go trough the process
    }

    @FXML
    void displayIncompleteTasks(ActionEvent event) {
        //when displayIncompleteTasks is clicked it should call a class which will go trough the process
    }

    @FXML
    void displayTasks(ActionEvent event) {
        operations.displayList();
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
    void markCompleteClicked(ActionEvent event) {
        //when markComplete is clicked it should call a class which will go trough the process
    }

    @FXML
    void removeTaskClicked(ActionEvent event) {
        int taskID = Integer.parseInt(taskIDText.getText());
        operations.deleteTask(taskID);
        System.out.print(taskID);
    }

    @FXML
    void loadListClicked(ActionEvent event) {
        //will LoadList
    }

    @FXML
    void newListClicked(ActionEvent event) {
        //delete this method
    }

    @FXML
    void clearList(ActionEvent event) {
        //will clear memory
    }
}
