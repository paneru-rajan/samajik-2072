package Allinone;

import java.util.Scanner;
import java.lang.*;

import static java.lang.System.exit;

public class main {
    public static void main(String[] args) {
        while (true) {
            System.out.println("******** Enetr Your Choice *********");
            System.out.println("1.Armstrong\n" + "2.EvenNumber\n" + "3.Fibonacci\n" + "4.Factorial\n" + "5.Fizz Buzz\n" + "6.Prime Number\n" + "7.Reverse String\n" + "8.Exit\n");
            Scanner number = new Scanner(System.in);
            int choice = number.nextInt();
            switch (choice) {
                case 1:
                    Armstrong armstrong;
                    armstrong = new Armstrong();
                    break;
                case 2:
                    EvenNumber evenNumber;
                    evenNumber = new EvenNumber();
                    break;
                case 3:
                    Fibonacci fibonacci;
                    fibonacci = new Fibonacci();
                    break;
                case 4:
                    Factorial factorial;
                    factorial = new Factorial();
                    break;
                case 5:
                    FizzBuzz fizzbuzz;
                    fizzbuzz = new FizzBuzz();
                    break;
                case 6:
                    PrimeNumber primenumber;
                    primenumber = new PrimeNumber();
                    break;
                case 7:
                   ReverseString reversestring;
                   reversestring = new ReverseString();
                    break;
                case 8:
                    exit(0);

                default:
                    System.out.println("!!!!!!WARING!!!!!!\n" + "Enter the VALID CHOICE");
            }
        }

    }

}