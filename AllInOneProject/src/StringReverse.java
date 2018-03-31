import javax.lang.model.element.NestingKind;
import java.util.*;
public class StringReverse {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a string");
        String s= scan.nextLine();
        char [] s1=new char[s.length()];
        int k=0;
        for (int i=s.length()-1;i>=0;i--){
            s1[k]=s.charAt(i);
            k++;
        }
        System.out.println(s1);
    }
}
