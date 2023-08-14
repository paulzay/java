package DataStructures;

public class Arrays {
    public static void main(String[] args){
        //TODO- Declare a variable named colors of an array of String of length 5
        String[] colors = new String[5];

        //TODO- Fill the array with the requested colors
        colors[0] = "red";
        colors[1] = "yellow";
        colors[2] = "orange";
        colors[3] = "green";
        colors[4] = "blue";

        //TODO- Replace green with emerald in the array
        colors[3] = "emerald";

        //Print the contents of the array
        for(String color:colors){
            System.out.println(color);
        }

        // array without length limit
        int[] numbers = {1,2,3,4,5};
        String[] names = {"Mo", "Salah"};
    }
}
