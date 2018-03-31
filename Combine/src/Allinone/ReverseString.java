package Allinone;

import java.util.Scanner;

public class ReverseString {
    public ReverseString(){

        //1: Using our own logic
        String original; //for storing user input
        String reverse = " "; //for storing reverse
        //input from user
        System.out.println("Enter String to Reverse: ");
        Scanner sc = new Scanner(System.in);
        original = sc.nextLine();
        int len = original.length();
        for (int i= len-1; i>=0;i--)
            reverse = reverse + original.charAt(i);
        //Print both the string object
        /*
        using string buffer
        StringBuffer sb = new StringBuffer.(original);
        reverse = sb.reverse().toString();
        */
        System.out.println("Original String is: "+original);
        System.out.println("Reverse String is: "+reverse);

    }
}
