import java.util.Scanner;
public class fibo {

    public static long fibo(int range)
    {

        if(range<=1)
            return range;
        else
        {
            return fibo(range-1)+fibo(range-2);
        }

    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int range=scan.nextInt();
        for (int i=1;i<=range;i++) {
            System.out.println(  fibo(i));

        }
    }

}