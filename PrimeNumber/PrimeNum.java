import java.util.Scanner;

public class PrimeNum
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number upto you want to print:");
        int n= sc.nextInt();
        for(int i=2;i<=n;i++)
        {
            for(int j=2;j<=i;j++)
            {
                if(j==i)
                {
                    System.out.println(i + " ");
                }
                if(i%j==0)
                {
                    break;
                }
            }
        }
    }
}