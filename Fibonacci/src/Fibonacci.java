import java.util.Scanner;
public class Fibonacci {
    private static void f_fun(int a, int b, int t){
        System.out.print(a+", ");
        if(t <= 2 ){
            System.out.print(b);
        }
        else {
            f_fun(b, a + b, t - 1);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = 0, b = 1;
        System.out.println("\tProgram to generate fibonnac series\n");
        System.out.print("Enter the no. of terms: ");
        int t = sc.nextInt();
        System.out.print("\nThe fibo seris upto " +t+ " terms: ");
        //sc.close();
        f_fun(a,b,t);

    }
}