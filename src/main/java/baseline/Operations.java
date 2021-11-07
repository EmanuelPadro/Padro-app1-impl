package baseline;

/*
 *  UCF COP3330 Summer 2021 Application Assignment 1 Solution
 *  Copyright 2021 Emanuel Padro
 */


import java.util.ArrayList;
import java.util.List;

public class Operations {
    List<Task> tasks =  new ArrayList<>();

    public void addTasks(Task newTask){
        this.tasks.add(newTask);
    }

    public String returnTaskDesc(int taskID){
        return tasks.get(taskID).description;
    }

    public String returnTaskDueDate(int taskID){
        return tasks.get(taskID).dueDate;
    }

    public void editTask(int taskID, Task newTask){
        tasks.set(taskID,newTask);
    }
    public void deleteTask(int taskID){
        tasks.remove(taskID);
    }

    public void displayList(){
        for (int i = 0; i < tasks.size() ; i++){
            System.out.println("Task " + i + ": ");
            System.out.println("Description: " + tasks.get(i).description);
            System.out.println("Due Date: " + tasks.get(i).dueDate);
            System.out.println("--------------------------------");
        }
    }
    public void displayComplete(){
        //Will display only complete tasks
    }
    public void displayIncomplete(){
        //Will display only incomplete tasks
    }

}
