package project;

public class MorningRoutine {
    public static void main(String[]args){
        TodoList myTodoList = new TodoList("Wednesday Grind");
        myTodoList.addTask("Wake up");
        myTodoList.addTask("Shower");
        myTodoList.addTask("Have breakfast");
        myTodoList.addTask("Go to work");
        myTodoList.display();
        myTodoList.markAsDone("Wake up");
        myTodoList.markAsDone("My working day");
        myTodoList.display();
        myTodoList.removeTask("Have Breakfast");
        myTodoList.display();
        myTodoList.rename("Shower", "Take bath");
        myTodoList.display();
    }
}
