package classes;

public class Main {
    public static void main(String[] args){
        Lens firstLens = new Lens("Canon","80mm", true);
        System.out.println(firstLens.brand);
        System.out.println(firstLens.focalLength);
        System.out.println(firstLens.isPrime);
    }

    static class Lens {
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
