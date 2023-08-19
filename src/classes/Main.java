package classes;

public class Main {
    public static void main(String[]args){

    }

    public class Lens {
        String brand;
        String focalLength;
        boolean isPrime;

        // constructor definition
        Lens(String brand,
             String focalLength,
             boolean isPrime){
            this.brand = brand;
            this.focalLength = focalLength;
            this.isPrime = isPrime;
        }
    }
}
