import static java.lang.Math.pow;
public class ArmStrong {
    static int conc(int i){
        int b=0, a;
        while (i > 0)
        {
            a = i % 10;
            b += (int) pow(a,3);
            i /= 10;
        }
        return b;
    }
    public static void main(String[] args)  {
        int  b;
        System.out.print("\n\tProgram to generate Armstrong numbers:\n");
        System.out.print("\nThe Armstrong numbers are (of 3 digits): ");
        for(int i = 100;i<999;i++){
            b=conc(i);
            if(b==i)
                System.out.print(b+", ");
        }
        System.out.println();
    }
}
