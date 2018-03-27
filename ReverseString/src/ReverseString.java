import java.util.Scanner;
public class ReverseString {

    static Scanner scan = new Scanner(System.in);

    public static String reverse(String text) {
        char[] s = text.toCharArray();
        int start =  0;
        int end = text.length() -1 ;
        char temp;
        while (end > start) {
            temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            end--;
            start++;
        }
        return new String(s);
    }

    public static void main(String[] args) {
        String s;
        System.out.println("Enter the string : ");
        s = scan.nextLine();
        scan.close();
        s = reverse(s);
        System.out.println("The reversed string is " + s );
    }
}
