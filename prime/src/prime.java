import java.util.Scanner;
import java.lang.Math;

public class prime {
    public static void main(String[] args) {
        int i,num,j;
        boolean flag=false;
        System.out.println("Enter a number ");
        Scanner in = new Scanner(System.in);
        num = in.nextInt();
        double l=Math.sqrt(num);
        j=(int)l;
        for(i=2;i<j;i++){
            if(j%i==0){
               flag=true; break;
            }
            else
                continue;
        }
        if(flag==true)
            System.out.println("The number is not prime");
        else
            System.out.println("The number is prime");
    }
}
