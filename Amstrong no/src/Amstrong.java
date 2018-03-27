public class Amstrong {
public static void main(String[] args){
    int n,a,b,c,count=0,sum=0;
    for(int i=0;i<=1000;i++) {
        n = i;
        while (n > 0) {
            b = n % 10;
            sum = sum + (b * b * b);
            n = n / 10;
        }
        if (sum == i)
            System.out.println(i + " ");
        sum = 0;
    }
}
}
