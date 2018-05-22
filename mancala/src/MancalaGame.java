import java.util.Scanner;

public class MancalaGame
{
    static int board[]=new int[14];
    public static void main(String args[])
    {
        //int board[14];
        String choice, replay;
        do
        {
            resetValue();
            System.out.println("Would you like to go first?(Y/N)");
            System.out.println("Press respective alphabet and hit enter");
            Scanner in = new Scanner(System.in);
            choice = in.nextLine();
//            if (choice=='n'||choice=='N')
            System.out.println("Would you like to play again? (Y/N)");
            replay= in.nextLine();

        }while (replay.charAt(0)=='Y'||replay.charAt(0)=='y');




    }
    public static void resetValue()
    {
        for (int i=1;i<7;i++)
            board[i]=4;
        for (int i=8;i<14;i++)
            board[i]=4;
        board[0]=0;
        board[7]=0;


    }
}
