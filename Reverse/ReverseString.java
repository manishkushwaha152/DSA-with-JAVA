package Reverse;
import java.util.Scanner;
public class ReverseString {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);                                             /* */
        System.out.println("Enter The String:");
        String string = sc.nextLine();
        // Stores the reverse of given string
        String reversedStr = "";

        // Iterate through the string from last and add each character to variable
        // reversedStr
        for (int i = string.length() - 1; i >= 0; i--) {
            reversedStr = reversedStr + string.charAt(i);
        }

        System.out.println("Original string: " + string);
        // Displays the reverse of given string
        System.out.println("Reverse of given string: " + reversedStr);
    }
}

/*Explanation Step-by-Step:
1. for (int i = string.length() - 1; i >= 0; i--)
This is a for loop that starts at the last character of the string.

string.length() - 1 gives the index of the last character in the string (since indexing starts from 0).

i >= 0 means it will continue until it reaches the first character.

i-- means it decrements the index by 1 in each iteration (moves backward through the string).

2. reversedStr = reversedStr + string.charAt(i);
string.charAt(i) gets the character at position i.

This character is then added (concatenated) to the end of reversedStr.

So in each iteration, one character from the original string (starting from the end) is added to reversedStr */
