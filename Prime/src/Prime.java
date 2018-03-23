import java.util.Scanner;
public class Prime {
    private static int prime(int p){
        int count=0;
        for (int i = 2; i<p; i++){
            if(p % i==0){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sr= new Scanner(System.in);
        System.out.print("\t\tProgram to check Number Whether It Is Prime Or NOt\n\nEnter The Number: ");
        int Num = sr.nextInt();
        int p = prime(Num);
        if(p==0){
            System.out.println(Num+" is Prime number.");
        }
        else{
            System.out.print(Num+ " is not Prime number.");
        }
    }
}
