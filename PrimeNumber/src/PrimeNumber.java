import java.util.Scanner;

public class PrimeNumber {
    static Scanner scan = new Scanner(System.in);

    static void primeNumber() {
        int i,n,j;
        System.out.println("Prime numbers upto where? :");
        n = scan.nextInt();
        for(i=2;i<=n;i++) {
            int flag = 0;
            for (j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        primeNumber();
    }
}