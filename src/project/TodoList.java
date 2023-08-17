package project;

import java.util.HashMap;
import java.util.Map;

public class TodoList {
    String title;
    HashMap<String, Boolean> tasks;

    public TodoList(String title){
        this.title = title;
        this.tasks = new HashMap<>();
    }

    public void addTask(String taskName){
        this.tasks.put(taskName, false);
    }

    public void display(){
        if(this.tasks.isEmpty()){
            System.out.println("Our Todo List for " + title + "is currently empty!");
        }else {
            System.out.println("Here is our Todo List for " + title);
            for(Map.Entry<String, Boolean> task : this.tasks.entrySet()) {
                if (task.getValue()) {
                    System.out.println("Task " + task.getKey() + " is complete");
                }else {
                    System.out.println("Task " + task.getKey() + " is not done");
                }
            }
        }
    }

    public void removeTask(String taskName) {
        if (this.tasks.containsKey(taskName)){
            System.out.println("Removing " + taskName);
            this.tasks.remove(taskName);
        }else {
            System.out.println("No such task!");
        }
    }

    public void rename(String oldTask, String newTask) {
        System.out.println("Renaming " + oldTask + " to " + newTask);
        if (this.tasks.containsKey(oldTask)){
            this.tasks.put(newTask, this.tasks.get(oldTask));
            this.tasks.remove(oldTask);
        }else {
            System.out.println("No such task!");
        }
    }

    public void markAsDone(String taskName){
        System.out.println("Marking " + taskName + " as done");
        if(this.tasks.containsKey(taskName)){
            this.tasks.put(taskName, true);
        }else {
            System.out.println("No such task found");
        }
    }

}
