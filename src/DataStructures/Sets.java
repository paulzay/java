package DataStructures;

import java.util.HashSet;
import java.util.Set;

public class Sets {
    // A set is a collection of unordered unique elements.
    // You'd use them when you don't care about the order
    // - like a list of ingredients for a recipe.

    // Hashset
    public static void main(String[] args){
        Set<String> ingredients = new HashSet<>();
        // *Add* a new element with a new key
        // *Remove* an element for a specific key
        // *Count* the number of elements in the set

        ingredients.add("eggs");
        ingredients.add("sugar");
        ingredients.add("butter");
        ingredients.add("salt");

        System.out.println(ingredients);
        ingredients.remove("salt");
        System.out.println(ingredients.size());
    }
}
