import java.util.Scanner;

public class Factorial {

    static int fact(int n) {
        if(n>1)
            return n*(n-1);
        return n;
    }

    public static void main(String[] args) {
        int n;
        System.out.println("Factorial of what?");
        Scanner read = new Scanner(System.in);
        n = read.nextInt();
        System.out.println(fact(n));
    }
}
