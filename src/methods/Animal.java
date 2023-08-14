package methods;

public class Animal {

    public int count = 0;
    public void increment() {
        Animal animal = new Animal();
        animal.count+=1;
    }

    public static void printName() {
        String name = "Rocky";
        System.out.println(name);
    }

    public static void main(String[] args) {
        //TODO: Run the printName function
        Animal animal = new Animal();
        animal.printName();
    }
}