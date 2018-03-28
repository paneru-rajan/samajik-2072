import java.util.Scanner;
import java.util.*;

public class prime {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {


        System.out.println("Enter The Range:");
        int Rangeofprimenum;
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        Rangeofprimenum = scan.nextInt();
        linkedList.add(2);
        double start_time = System.nanoTime();
        for (int j = 3; j <= Rangeofprimenum; j++) {
            int flag = 0;
            for (int i = 0; i < ((int) Math.sqrt(j)); i++)

            {


                if (j % (linkedList.get(i)) == 0) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                linkedList.add(j);
            }
        }


        System.out.print(linkedList);

        double stop_time = System.nanoTime();
        double elapsed_time = stop_time - start_time;
        System.out.print("\n");
        System.out.print( elapsed_time/1000000000);

    }
}
