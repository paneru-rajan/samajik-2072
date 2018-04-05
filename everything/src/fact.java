import java.util.Scanner;

public class fact
{
    public static int fact1(int n)
    {

        if(n==0)
            return 1;
        else
            return n*fact1(n-1);
    }


    public static void main(String args[])
    {
        System.out.println("Enter a number");
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        long result=fact1(n);
        System.out.print("The factorial is ");
        System.out.print(result);
    }


}
