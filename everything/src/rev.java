import java.util.Scanner;
public class rev {
    public static void main(String[] args) {
        System.out.print("Enter string to be reversed: ");
        Scanner read = new Scanner(System.in);
        String saveLine = read.nextLine();
        read.close();
        System.out.println("Reversed string is: " + new StringBuilder(saveLine).reverse());
    }
}