package Leetcode;

import java.util.Arrays;

public class Anagram {
//    Given two strings s and t, return true if t is an anagram of s, and false otherwise.
//    An Anagram is a word or phrase formed by rearranging the letters of a different
//    word or phrase, typically using all the original letters exactly once.
    public static void main(String[]args){
        String s = "anagram";
        String t = "nagaram";

        System.out.println(isAnagram(s,t));
    }
    public static boolean isAnagram(String s, String t) {
        // convert args to array
        char[] arrayS = s.toCharArray();
        char[] arrayT = t.toCharArray();
        // use built-in sort
        Arrays.sort(arrayT);
        Arrays.sort(arrayS);

        return Arrays.equals(arrayT, arrayS);
    }
}
