import java.util.Scanner;
public class Factorialloop {
    public static void main(String args[])
    {
    int fact=1;
    Scanner reader=new Scanner(System.in);
System.out.print("Enter the number you want to find the factorial of:");
    int n=reader.nextInt();
    for(int i=1;i<=n;i++)
    {
        fact=fact*i;
    }
System.out.println("The factoral is:  "+fact);
}
}