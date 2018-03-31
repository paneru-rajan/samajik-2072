import java.util.Scanner;
public class Factorial {

    protected static int factor(int n)
    {
        if(n==1)
            return 1;
        else
            return factor(n-1)*n;
    }

    public static void main(String[] args) {

        System.out.println("Enter the number");
        Scanner scan=new Scanner(System.in);
        int range=scan.nextInt();
        System.out.println("The factorial is :"+factor(range));
    }
}