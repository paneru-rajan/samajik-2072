import java.util.Scanner;
class AllinOne {
    static void choose(){
        Scanner sr = new Scanner(System.in);
        System.out.println("\t\tAll In One Program\n");
        System.out.print("Choose one of the program: \n" +
                "1. ArmStrong\n" +
                "2. Even Number\n" +
                "3. Factorial\n" +
                "4. Fibonacci\n" +
                "5. FizzBuzz\n" +
                "6. Prime Numbers\n" +
                "7. Reverse String\n" +
                "8. Exit From Program\n" +
                "\nEnter Your Choice: ");
        int n = sr.nextInt();
        switch(n){
            case 1:
                ArmStrong.main(null);
                break;
            case 2:
                Even.main(null);
                break;
            case 3:
                Factorial.main(null);
                break;
            case 4:
                Fibonacci.main(null);
                break;
            case 5:
                FizzBuzz.main(null);
                break;
            case 6:
                Prime.main(null);
                break;
            case 7:
                ReverseString.main(null);
                break;
            case 8:
                System.exit(8);
            default:
                System.out.println("Invalid Input");
                break;
        }
        System.out.print("\n\nDo You Want To Try Again(y/n): ");
        String c = sr.next();
        if(c.charAt(0)=='y'||c.charAt(0)=='Y') {
            System.out.println("\n");
            choose();
        }
        sr.close();
    }
    public static void main(String[] args){
        choose();
    }
}
