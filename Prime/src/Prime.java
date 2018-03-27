import java.math.BigInteger;
import java.util.Scanner;
public class Prime {
    private static boolean c_prime(int p) {
        BigInteger b = new BigInteger(String.valueOf(p));
        return b.isProbablePrime(1);
    }
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        System.out.print("\t\tProgram to check Number Whether It Is Prime Or NOt\n\nEnter The terms: ");
        int t = sr.nextInt();
        System.out.print("\nThe Prime numbers: ");
        for (int i = 0; ; i++) {
            if (t != 0) {
                if(c_prime(i)){
                    System.out.print(i+ ", ");
                    t--;
                }
            }
            else
                break;
        }
    }
}
