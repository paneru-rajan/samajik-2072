public class Fibonacci {

    public static void Fibo(int n)
    {
        int f[]= new int[n+1];

        f[0]=0;
        f[1]=1;

        if(n==0)
        {
            System.out.println("0");
        }
        if(n==1)
            System.out.println("0 1");
        if(n==2)
            System.out.println("0 1 1");
        for(int i=2;i<=n;i++) {

            f[i]= f[i-1]+f[i-2];
        }
        for(int i=0;i<=n;i++) {
            System.out.println(f[i]);
        }
    }

    public static void main(String[] args) {
        int n=10;
        Fibo(n);
    }
}
