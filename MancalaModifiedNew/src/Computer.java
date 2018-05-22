import java.util.Random;

import static java.lang.Thread.sleep;

public class Computer
{
    public static void main()
    {
        Random rand=new Random();
        int choice=1+rand.nextInt(11);
        if(choice==0||choice==6||choice==9||BoardDisplay.board[choice]==0)
            Computer.main();
        int moves=BoardDisplay.board[choice];
        if(choice>6)
            System.out.println("Computer choose "+(choice-1));
        else
            System.out.println("Computer choose "+choice);

        if (choice==3)
        {
            int direction=rand.nextInt(2);
            if(direction==0)
                choice=3; //right
            else
            {//left
                choice=9;
                moves=BoardDisplay.board[3];
                BoardDisplay.board[3]=0;
            }
        }
        BoardDisplay.board[choice]=0;
        for (int i=moves;i>0;i--,choice--)
        { //fill the board
            switch ((choice-1))
            {
                case -1:
                    choice=12;
                    BoardDisplay.board[11]++;  break;
                case 6:
                    choice--;
                    BoardDisplay.board[5]++;
                    break;
                case 9:
                    BoardDisplay.board[3]++;
                    break;
                default:
                    BoardDisplay.board[choice-1]++;
            }
        }
        if ((choice)== 0) //replay the game
        {
            System.out.println("Computer got another chance");
            Computer.main();
        }
        if(!GameCheck.main())
        {
            System.out.println("Computer's turn is over");
            Player.main();
        }
    }
}
