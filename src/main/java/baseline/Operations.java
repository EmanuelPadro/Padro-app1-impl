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

    public List<String> displayList(){
        ArrayList<String> listPrint = new ArrayList<>();
        for (int i = 0 ; i < tasks.size() ; i++){
            listPrint.add("Task " + i + " -  Due Date: " + tasks.get(i).dueDate +
                    "\nDescription: " + tasks.get(i).description + "\n\n");
        }
        return listPrint;
    }


    public void displayComplete(){
        //Will display only complete tasks
    }
    public void displayIncomplete(){
        //Will display only incomplete tasks
    }

}
