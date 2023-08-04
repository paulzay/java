package DataTypes;

public class Numbers {
    public static void main(String[] args){
        // arithmetic operations
        int ten = 10;
        int two = 2;

        int add = ten + two;
        int multiply = ten * two;
        int subtract = ten - two;
        int divide = ten / two;

        System.out.println(add);
        System.out.println(multiply);
        System.out.println(divide);
        System.out.println(subtract);

        // math class
        System.out.println(SquareRoot(25));
        System.out.println(Math.min(2,10));
        System.out.println(Math.max(10,2));
        System.out.println(Math.abs(-10));
        System.out.println((int)Math.pow(2,5));
    }

    // Math class
    public static int SquareRoot(int x){
        return (int)Math.sqrt(x);
    }

}
