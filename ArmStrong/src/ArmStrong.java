public class ArmStrong {
    public static void main(String[] args)  {
        int a,temp,b;
        for(int i = 100;i<999;i++){
            temp=i;
            a=temp%10;
            temp/=10;
            b=temp%10;
            temp/=10;
            temp=(a*a*a)+(b*b*b)+(temp*temp*temp);
            if(i==temp)
                System.out.print(temp+", ");
        }

    }
}
