import java.util.Scanner;
public class Fibonacci
{
    static long a=0,b=1;
    public static long fibo(long a,long b,long c){
            a=a+b;
            System.out.println(+a);
    if(c!=0)
    {
        return fibo(b,a,c-1);
    }
        return 0;
    }

    public static void main(String[] args)
    {
        Scanner reader=new Scanner(System.in);
        System.out.println(" c: ");
        long c=reader.nextLong();fibo(a,b,c);

    }
}

