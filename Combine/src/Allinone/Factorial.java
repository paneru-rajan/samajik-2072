package Allinone;

import java.util.Scanner;

public class Factorial {
        public Factorial() {
            int n, mul;
            Scanner s = new Scanner(System.in);
            System.out.print("Enter any integer:");
            n = s.nextInt();
            mul = fact(n);
            System.out.println("Factorial of "+n+" :"+mul);
        }
        public int fact(int x)
        {
            if(x > 1)
            {
                return(x*fact(x - 1));
            }
            return 1;
        }
}
