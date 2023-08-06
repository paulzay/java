package DataStructures;

import java.util.HashMap;
import java.util.Map;

public class Maps {
    // AKA Dictionaries
    public static void main(String[] args){
        Map<String, Integer> months = new HashMap <>();

        //TODO replace names with constant (final) String variables
        months.put("June", 6);
        months.put("September", 9);
        months.put("March", 5);

        //TODO Fix March with the proper value (3)

        //TODO Remove June

        //Print the content of the map
        System.out.println("Here are some interesting months");
        for (Map.Entry<String,Integer> month : months.entrySet()){
            System.out.println(month.getKey() + " is month number " + month.getValue() + " of the year ");
        }


    }
}
