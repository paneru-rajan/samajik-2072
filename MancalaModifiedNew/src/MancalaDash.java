import java.util.Scanner;

public class MancalaDash
{
    public static void main(String args[])
    {
            BoardReset();
            System.out.println("Welcome to Mancala game" +
                    "\nWould you like to go first?(Y/N)" +
                    "\nX or x to exit" +
                    "\nType respective alphabet and hit enter");
            Scanner in =new Scanner(System.in);
            String gameplay=in.nextLine();
            char a=gameplay.charAt(0);
            switch (a)
            {
                // y or Y for player
                //N or n for computer
                // x or X for exit
                // recursion for replay
                case ('y'):
                        Player.main(); /*player's move*/  break;
                case('Y') :
                        Player.main();/*player's move*/    break;
                case('n') :
                        Computer.main();/*Computer's move*/break;
                case('N') :
                        Computer.main();/*Computer's move*/break;
                case('X') :
                        System.exit(0);//exit
                case('x') :
                        System.exit(0);//exit
                default:
                        {
                            System.out.println("Invalid choice");
                            main(null);
                        }
            }

        BoardDisplay.main();
        System.out.println("Would you like to play again?(Y/N)");
            gameplay=in.nextLine();
            a=gameplay.charAt(0);
            if(a=='y'||a=='Y')
                main(null);
            else
                System.exit(0);


    }
    private static void BoardReset()
    {
        for (int i=1;i<12;i++)
        {
            BoardDisplay.board[i]=3;
        }
        BoardDisplay.board[0]=0;
        BoardDisplay.board[6]=0;
    }
}
