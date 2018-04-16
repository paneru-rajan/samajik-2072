import java.util.Scanner;
public class Factorialrecur
{
 static int factorial(int n){
     if(n==0)
         return 1;
     else
     return(n*factorial(n-1));
 }
 public static void main(String[] args){
     int fact;
     Scanner reader=new Scanner(System.in);
     System.out.println("enter the number :");
     int n= reader.nextInt();
     fact=factorial(n);
     System.out.println("The factorial of "+n+" is " +fact);

 }
}