import java.util.LinkedList;

public class Fibonacci {
    public static LinkedList<Integer> fib=new LinkedList<>();
    public static void main(String[] args) {
        int n1=0,n2=1,n3,count=10;
        fib.add(n1);
        fib.add(n2);
        for(int i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed
        {
            n3=n1+n2;
            fib.add(n3);
            //System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }
        System.out.print(fib);
    }
}

