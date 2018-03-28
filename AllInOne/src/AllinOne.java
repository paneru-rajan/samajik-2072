import java.util.Scanner;

public class AllinOne {


    public static void main(String[] args) {


    while(true) {
        System.out.println("Enter Your Choice");
        System.out.println("1. Armstrong\n " + "2.Even number\n" + "3. Faboninc\n" + "4.Factorial\n" + "5. Fizz Buzz\n" + "6. Prime Number\n" + "7. Reverse String\n");
        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();

        switch (choice) {
            case 1:
                armstrong.main(null);
                break;
            case 2:
                evennumber.main(null);
                break;
            case 3:
                faboninc.main(null);
                break;
            case 4:
                fact.main(null);
                break;
            case 5:
                fizbuz.main(null);
                break;
            case 6:
                prime.main(null);
                break;
            case 7:
                reversestring.main(null);
                break;
            default:
                System.out.println("Enter Valid Choice Only");

        }


    }







    }

}
