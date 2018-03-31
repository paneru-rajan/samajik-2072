package Allinone;

import java.util.Scanner;

public class EvenNumber {
    public EvenNumber(){
    System.out.println("Enter the Number to check:");
    Scanner sc= new Scanner(System.in);
    int i = sc.nextInt();
       if (i%2==0)
            System.out.println("The given number is Even");
       else
               System.out.println("The give number is not Even");

}
}