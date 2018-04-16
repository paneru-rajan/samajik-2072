import java.util.Scanner;
public class Gcd
{
static int gcd(int x,int y)
{
    int r,a,b;
a=(x>y)?x:y;
b=(x<y)?x:y;
r=b;
while(a%b!=0){
    r=a%b;
    a=b;
    b=r;
}
return r;
}
public static void main(String[] args){
Scanner input=new Scanner(System.in);
System.out.println("Enter the two no.");
int x=input.nextInt();
    int y=input.nextInt();
    System.out.println("the GCD is "+gcd(x,y));
}
}

