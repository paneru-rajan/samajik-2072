import java.util.LinkedList;
import java.util.Scanner;

public class armstrong {
//armstrong for 3 digit

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        for (int i = 100; i <= 999; i++) {
            int a = i % 10;
            int b = i / 10;
            int c = b % 10;
            int d = b / 10;
            int check = (a * a * a) + (c * c * c) + (d * d * d);
            if (check == i) {
                linkedList.add(check);
            }
        }

        System.out.print(linkedList);
    }

}