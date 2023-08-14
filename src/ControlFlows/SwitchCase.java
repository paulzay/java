package ControlFlows;

public class SwitchCase {
    public static void main(String[] args){
        String gender = "FEMALE";
        switch (gender){
            case "FEMALE":
                System.out.println("Girl-boss");
                break;
            case "MALE":
                System.out.println("Light saber!");
                break;
            case "CAN'T SAY":
                System.out.println("Won't give out info");
                break;
            default:
                System.out.println("Unknown gender");
        }
    }
}
