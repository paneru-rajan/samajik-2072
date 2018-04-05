import java.util.Scanner;
import java.lang.Math;

public class armstrong
{
    public static void main(String[] args)
    {
        int num,a;
        System.out.println("Enter a three digit number ");
        Scanner in = new Scanner(System.in);
        num = in.nextInt();
        a=arm(num);
        if(num==a)
            System.out.println("The number is armstrong ");
        else
            System.out.println("The number is not armstrong ");

    }
    public static int arm(int num)
    {
        int b=0;
        int[] a=new int[3];
        for(int i=0;i<3;)
        {
            a[i]=(int)(num/Math.pow(10,(2-i)));
            num=(int)(num%Math.pow(10,(2-i)));
            b=b+(int)Math.pow(a[i],3);
            i++;
        }
        //System.out.println(b);
        return b;

    }
}
