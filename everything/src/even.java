import java.util.Scanner;

public class even

{
    public static void main(String[] args)
    {
	int n;
	    System.out.println("Enter a number");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
	    System.out.println("The even numbers are:");
        for(int i=2; i<n; i+=2)
	   {
		System.out.print(i+" ");
	   }

    }
    
}
