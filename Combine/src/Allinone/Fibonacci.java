package Allinone;

import java.util.Scanner;

public class Fibonacci {
    public int f,n, fibonacci = 1, fibo1 = 1, fibo2 = 1;

    public int Fibonacci() {
        System.out.println("Enter the number to find fibonacci: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        f = fibonac(n);
        System.out.println("The fibonacci series:" + number + ":" + f);
    }
        public int fibonac (int number){
            if ( number == 1 || number == 2) {
                return 1;
            }

            for (int i = 3; i <= number; i++) {
                fibonacci = fibo1 + fibo2;
                fibo1 = fibo2;
                fibo2 = fibonacci;
            }
            return fibonacci;
        }
    }
