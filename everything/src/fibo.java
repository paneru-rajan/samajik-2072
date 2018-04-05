import java.util.Scanner;


public class fibo
{
    public static int fib(int n) {
        if(n <= 1) {
            return n;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }
    public static void main(String args[]) {
        int fib1;
        System.out.println("Enter a number");
        Scanner in = new Scanner(System.in);
        fib1 = in.nextInt();
        int n=fib(fib1);
        System.out.print("The fibonacci number is: ");
        System.out.println(n);
    }

}
