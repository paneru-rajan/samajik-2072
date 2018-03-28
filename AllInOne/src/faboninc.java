
import java.util.LinkedList;
import java.util.Scanner;

public class faboninc {

    static Scanner scan=new Scanner(System.in);

    public static void main(String[] args)

    {
        System.out.println("Enter The range of series:");
        int RangeofSeries;
        RangeofSeries = scan.nextInt();
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.add(0);
        linkedList.add(1);
        for (int i = 2; i < RangeofSeries; i++) {

            int a= (linkedList.get(i-2)+linkedList.get(i-1));
            linkedList.add(a);
        }

        System.out.print(linkedList);

    }
}
