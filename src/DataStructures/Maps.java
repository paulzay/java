package DataStructures;

import java.util.HashMap;
import java.util.Map;

public class Maps {
    // AKA Dictionaries
    public static void main(String[] args){
        Map<String, Integer> months = new HashMap <>();

        months.put("June", 6);
        months.put("September", 9);
        months.put("March", 5);

        //TODO replace names with constant (final) String variables

        final String kjune = "June";
        final String ksept = "September";
        final String kmarch = "March";

        months.put(kjune, 6);
        months.put(ksept, 9);
        months.put(kmarch, 5);
        //TODO Fix March with the proper value (3)

        months.put(kmarch, 3);
        //TODO Remove June

        //Print the content of the map
        System.out.println("Here are some interesting months");
        for (Map.Entry<String,Integer> month : months.entrySet()){
            System.out.println(month.getKey() + " is month number " + month.getValue() + " of the year ");
        }


    }
}
