package project;

import java.util.ArrayList;

public class TodoList {
    private String title;
    private ArrayList<String> tasks;

    public TodoList(String title){
        this.title = title;
        this.tasks = tasks;
    }


    public void addTask(String taskName){
        this.tasks.add(taskName);
    };

    public void display(){
        if(this.tasks.isEmpty()){
            System.out.println("Our Todo List for " + title + "is currently empty!");
        }else {
            System.out.println("Here is our Todo List for " + title);
            for(int i=0;i<this.tasks.size();i++) {
                System.out.println("Task " + i + " is " + this.tasks.get(i));
            }
        }

    };

    public  void remove(int i){
        try{
            this.tasks.remove(i);
        }catch(IndexOutOfBoundsException e) {
            System.out.println("Could not remove task, no task at this index!");
        }
    }

    public void rename(int i, String newTask) {
        try {
            this.tasks.set(i,newTask);
        }
        catch (IndexOutOfBoundsException e) {
            System.out.println("Could not rename task, no task at this index!");
        }
    }

}
