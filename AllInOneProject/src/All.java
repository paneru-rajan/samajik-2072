import java.util.*;

public class All {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (true){
            System.out.println("\nEnter you choice");
            System.out.println("1. Armstrong\n " + "2. Even number\n" + "3. Fibonacci\n" + "4. Factorial\n" + "5. Fizz Buzz\n" + "6. Prime Number\n" + "7. Reverse String\n");
            Scanner scan =new Scanner(System.in);

            int choice=scan.nextInt();
            switch (choice){
                case 1:
                    Armstrong.main(null);
                    break;
                case 2:
                    EvenNumber.main(null);
                    break;
                case 3:
                    Fibonacci.main(null);
                    break;
                case 4:
                    Factorial.main(null);
                    break;
                case 5:
                    FizzBuzz.main(null);
                    break;
                case 6:
                    PrimeNumber.main(null);
                    break;
                case 7:
                    StringReverse.main(null);
                    break;
                default:
                    System.out.println("Enter Valid Choice Only");

            }

            System.out.println("Goto main menu1?(Y)");
            String b=sc.nextLine();
            if (b=="y"||b=="Y"){
                System.out.println("\f");
            }

        }

    }
}
