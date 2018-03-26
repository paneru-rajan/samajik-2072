import java.util.Scanner;

public class Factorial {
    private static int fact(int n){
        if (n==0)
            return 1;
        else if(n>1)
            return n*fact(n-1);
        return 1;
    }
    public static void main(String[] args){
        Scanner sr = new Scanner(System.in);
        System.out.print("\tProgram to find Factorial\n\n");
        System.out.print("Enter the number find Factorial: ");
        int f = sr.nextInt();
        System.out.print("\nThe Factorial of "+f+" is: "+fact(f));
    }
}
