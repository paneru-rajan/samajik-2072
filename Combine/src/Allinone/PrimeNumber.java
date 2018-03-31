package Allinone;

import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

public class PrimeNumber {
    public PrimeNumber(){
    Scanner sc = new Scanner(System.in);
            System.out.println("Enter the Number to print prime list:");
    Instant start = Instant.now();
    int number= sc.nextInt();
            for (int i = 2; i < number; i++) {
        primes(i, Math.ceil(Math.sqrt(i)));
    }
    Instant end= Instant.now();
            System.out.println("\t Duration::" + Duration.between(start, end));
}

    public static int primes(int x, double i) {
        if (i == 1)
            System.out.println(x);
        if (x % i == 0)
            return 0;
        else
            return primes(x,i - 1);
    }
}
