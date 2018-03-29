import java.util.Scanner;
import java.lang.String;


public class string_reverse
{
    public static void main(String args[])
    {
        String ip,op="";
        System.out.println("Enter a string:");
        Scanner in = new Scanner(System.in);
        ip=in.nextLine();
        int l=ip.length()-1;
        for(int i=l;i>=0;i--)
        {
            op= op+ip.charAt(i);
        }
        System.out.println("The reversed string is");
        System.out.println(op);


    }
}
