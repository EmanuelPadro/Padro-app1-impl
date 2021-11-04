package baseline;

/*
 *  UCF COP3330 Summer 2021 Application Assignment 1 Solution
 *  Copyright 2021 Emanuel Padro
 */


import java.util.ArrayList;
import java.util.List;

public class Operations {
    List<Task> tasks =  new ArrayList<>();

    Operations(){}

    public void addTasks(Task newTask){
        this.tasks.add(newTask);
    }
    public void editTaskDescription(){
        //Access a task within a list and changes its description to new one
    }
    public void editTaskDueDate(){
        //Access a task within a list and changes its due date to a new one
    }
    public void deleteTask(){
        //access a task from list and remove it
    }
    public void displayList(){
        //simply displays a list for the use to view upon asking for it
    }
    public void displayComplete(){
        //Will display only complete tasks
    }
    public void displayIncomplete(){
        //Will display only incomplete tasks
    }

}
