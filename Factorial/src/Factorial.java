import java.util.Scanner;

public class Factorial {
    private static int Fact(int n){
        if (n==1)
            return 1;
        else if(n>1)
            return n*Fact(n-1);
        return 0;
    }
    public static void main(String[] args){
        Scanner sr = new Scanner(System.in);
        System.out.print("\tProgram to find Factorial\n\n");
        System.out.print("Enter the number find Factorial: ");
        int f = sr.nextInt();
        System.out.print("\nThe Factorial of "+f+" is: "+Fact(f));
    }
}
