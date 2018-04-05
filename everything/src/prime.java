import java.time.Duration;
import java.time.Instant;
import java.util.LinkedList;
import java.util.Scanner;

public class prime {
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the value of n:");
        int getLengthOfPrime = scan.nextInt();
        scan.close();
        Instant start = Instant.now();
        LinkedList<Integer> primeList = new LinkedList<Integer>();
        if (getLengthOfPrime >= 2)
            primeList.add(2);
        for (int i = 3; i <= getLengthOfPrime; i++) {
            boolean isPrime = true;
            for (Integer primeNumber : primeList) {

                if (i % primeNumber == 0)
                    isPrime = false;
                if (!isPrime || primeNumber > Math.sqrt(i))
                    break;
            }
            if (isPrime)
                primeList.add(i);
        }
        System.out.println("Elements of PrimeNumberWithoutRoot Number");
        System.out.print("\t" + primeList);
        System.out.println("\n\n\tTotal Number of prime :: " + primeList.size());
        Instant end = Instant.now();
        System.out.println("\tDuration :: " + Duration.between(start, end));
    }
}