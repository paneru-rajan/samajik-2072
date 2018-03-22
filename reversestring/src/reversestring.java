import java.util.Scanner;


public class reversestring {
    static Scanner scan = new Scanner(System.in);
    public static void main (String[] args)
    {

        String InputString;
        System.out.println("Enter Your String");
        InputString=scan.nextLine();


        StringBuilder str=new StringBuilder(InputString);
        System.out.println(str.reverse());


    }


}
