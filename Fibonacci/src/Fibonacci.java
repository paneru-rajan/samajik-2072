public class Fibonacci
{
    public static long fibonacci(long n)
    {
        if(n<=1)
            return n;
        else
            return fibonacci(n-1)+fibonacci(n-2);
    }

    public static void main(String[] args)
    {
        for(int i=0;i<=10;i++)
            System.out.println( i +":" +fibonacci(i));
    }}