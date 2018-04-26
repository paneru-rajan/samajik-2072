public class Armstrong {

    static boolean ArmstrongNumberCheck(int temp) {
        int[] a=new int[3];
        int n,temp1;
        n = temp;
        temp1 = 0;
        for(int i=0;i<3;i++) {
            a[i] = temp % 10;
            temp = temp / 10;
            temp1 = temp1+ (int)Math.pow(a[i],3);
        }
        if(n == temp1)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        for(int i=100;i<1000;i++) {
            if (ArmstrongNumberCheck(i))
                System.out.print(i + ",");
        }
    }
}