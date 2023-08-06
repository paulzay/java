package DataStructures;

import java.util.ArrayList;

import java.util.List;

public class Lists {
    public static void main(String[] args){
//        List<Integer> myList = new ArrayList<Integer>();
//        List<String> course = new ArrayList<String>();
//
//        myList.add(7); // -> [7]
//        myList.add(5); //-> [7, 5]
//        myList.add(1,12); //-> [7, 12, 5]
//        myList.set(0,4); // -> [4, 12, 5]
//        myList.remove(1); // removed 12 -> [4, 5]
//
//        System.out.println(myList);
//        System.out.println(myList.size());

        //TODO Replace the ?? by the proper code to create an ArrayList of String
        List<String> guests = new ArrayList<String>();

        //TODO Add Joey, Martin and Marie to the list
        guests.add("Joey");
        guests.add("Martin");
        //TODO Complete the following statement by replacing the ?? to display the size of the list
        System.out.println(guests.size());

        //TODO Replace Martin with John in the list
        guests.add(1, "John");
        //TODO Remove Joey from the list
        guests.remove(0);
        //Print the content of the list
        System.out.println("The guests are:");
        for(String guest: guests){
            System.out.println(guest);
        }
    }
}
