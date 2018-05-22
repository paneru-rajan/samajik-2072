import java.util.Scanner;

public class allin
{
    public static void main(String[] args)
    {
        int opt;
        String c;
        do {
            System.out.println("Enter your choice");
            System.out.println("1.Armstrong number\n" +
                                "2.Even number\n" +
                                "3.Factorial\n" +
                                "4.Fibonocci\n" +
                                "5.Prime\n" +
                                "6.String reverse\n");
            Scanner scan = new Scanner(System.in);
            opt = scan.nextInt();
            programs(opt);
            System.out.println("\nWould you like to load main menu again?(y/n)");
            c = scan.next();
        }while (c.charAt(0) != 'n');
    }
    static void programs(int opt)
    {
        switch(opt) {
            case 1:
                armstrong.main(null);
                break;
            case 2:
                even.main(null);
                break;
            case 3:
                fact.main(null);
                break;
            case 4:
                fibo.main(null);
                break;
            case 5:
                prime.main(null);
                break;
            case 6:
                rev.main(null);
                break;

            default:
                System.out.println("Invalid choice!");
        }
    }

}
