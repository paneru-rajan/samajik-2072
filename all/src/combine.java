import java.util.Scanner;

public class combine {

        static void Find_Algorithm(int choice) {
        switch(choice) {
            case 1:
                armstrong.main(null);
                break;
            case 2:
                evennumbers.main(null);
                break;
            case 3:
                fact.main(null);
                break;
            case 4:
                fibo.main(null);
                break;
            case 5:
                FizzBuzz.main(null);
                break;
            case 6:
                prime.main(null);
                break;
            case 7:
                reversestring.main(null);
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }

    public static void main(String[] args) {
        int choice;
        String c="n";
        while(c.charAt(0) != 'y') {
            System.out.println("Make a choice:");
            System.out.println("" +
                    "1. Armstrong Number\n" +
                    "2. Even Number\n" +
                    "3. Factorial\n" +
                    "4. Fibonacci Number\n" +
                    "5. FizzBuzz\n" +
                    "6. Prime Number\n" +
                    "7. Reverse String\n");
            Scanner scan = new Scanner(System.in);
            choice = scan.nextInt();
            Find_Algorithm(choice);
            System.out.println("\nDo you want to exit? \n y = yes\n n = no");
            c = scan.next();
        }

    }
}