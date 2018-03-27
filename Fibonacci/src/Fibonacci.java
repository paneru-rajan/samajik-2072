import java.util.Scanner;

public class Fibonacci {
    static Scanner scan = new Scanner(System.in);

    static int Fibonacci(int n) {
        if(n==0 || n==1)
            return n;
        else
            return Fibonacci(n-1)+Fibonacci(n-2);
    }

    public static void main(String[] args) {
        int n,temp;
        System.out.println("How many Fibonacci numbers?:");
        n = scan.nextInt();
        scan.close();
//        n = Fibonacci(n);
//        System.out.print(n + ",");
        for(int i=1;i<=n;i++) {
            temp = Fibonacci(i);
            System.out.print(temp + ",");
        }
    }
}
