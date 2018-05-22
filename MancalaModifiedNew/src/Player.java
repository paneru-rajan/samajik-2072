import java.util.Scanner;

//import static jdk.vm.ci.meta.JavaKind.Char;

public class Player
{
    public static void main()
    {
        BoardDisplay.main();
        Scanner in=new Scanner(System.in);
        System.out.print("Choose your input: ");
        int choice=in.nextInt();
        if(choice>5)
            choice++;
        if(choice>11||choice<0||choice==8||BoardDisplay.board[choice]==0)
        {
            System.out.println("!!!Invalid Entry!!!");
            Player.main();
        }
        int moves=BoardDisplay.board[choice];
        if (choice==3)
        {
            char b;
            do {
                System.out.println("Enter the direction you want to go(R/L)");
                b= in.next().charAt(0);
                if (b == 'L' || b == 'l')
                {
                    choice = 9;
                    moves=BoardDisplay.board[3];
                    BoardDisplay.board[3]=0;
                }
                else if (b == 'R' || b == 'r')
                    choice = 3;
                else
                    System.out.println("Invalid entry");
            }while ((b == 'l' && b == 'L' && b == 'r' && b == 'R'));
        }
        BoardDisplay.board[choice]=0;
        for (int i=moves;i>0;i--,choice++)
        { //fill the board
            if ((choice+1) == 12)
                choice = 0;//after 11 goes to 0
            if ((choice+1) == 9)
                {
                    BoardDisplay.board[3]++;
                }
            else
                BoardDisplay.board[choice+1]++;
        }
        if (choice == 6) //replay the game
        {
            System.out.println("\n\tYou got another chance\n");
            Player.main();
        }
        BoardDisplay.main();
        if(!GameCheck.main())
            Computer.main();
    }
}