public class Armstrong
{
    public static void main(String[] args)
    {
        int n, count = 0, a, b, c, sum = 0;
        System.out.print("Armstrong numbers:");
        for(int i = 100; i <= 999; i++)
        {
            n = i;
            while(n > 0)
            {
                b = n % 10;
                sum = sum + (b * b * b);
                n = n / 10;
            }
            if(sum == i)
            {
                System.out.print(i+" ");
            }
            sum = 0;
        }
    }
}