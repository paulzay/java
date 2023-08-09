package ControlFlows;

public class Loops {
    public static void main(String[] args){
        // for-loop
        for(int i=0; i<5; i++){
            System.out.println(i);
        }

        // For loops with collections
        int[] myArray = new int[]{7,2,4};

//        for (int i=0; i<myArray.length; i++) {
//            System.out.println(myArray[i]);
//        }
        // enhanced 'for'
        for (int j : myArray) {
            System.out.println(j);
        }

        // while-loop && do/while-loop
        int numberOfTrees = 0;

        while (numberOfTrees < 10) {
            numberOfTrees += 1;
            System.out.println("I planted " + numberOfTrees + " trees");
        }

        System.out.println("I have a forest!");

        int pushUpGoal = 10;
        do{
            System.out.println("Push up!");
            pushUpGoal -= 1;
        } while(pushUpGoal > 0);
    }

    public static void FizzBuzz(String[] args){

    }

}
