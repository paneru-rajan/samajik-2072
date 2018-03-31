package Allinone;

public class FizzBuzz {
    public FizzBuzz() {
        //if a number is multiple of 3 print "Fizz"
        //If a number is multiple of 5 print "Buzz"
        //If a number is multiple of both 3 & 5 print "FizzBuzz"
        for (int i = 0; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
