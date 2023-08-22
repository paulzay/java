package Leetcode;

public class PalindromeNumber {
//    Given an integer x, return true if x is a palindrome, and false otherwise.
    public static void main(String[]args){
        int x = -121;
        System.out.println(isPalindrome(x));
    }

    public static boolean isPalindrome(int x){
        String y = Integer.toString(x);
        String z = new StringBuilder(y).reverse().toString();
        return y.equals(z);
    }
}
