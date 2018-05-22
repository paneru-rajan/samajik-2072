public class GameCheck
{
    public static boolean main()
    {
        if(BoardDisplay.board[0]>=5||BoardDisplay.board[6]>=5)
        {
            int ComputerScore=BoardDisplay.board[0]+BoardDisplay.board[1]+BoardDisplay.board[2]+BoardDisplay.board[10]+BoardDisplay.board[11];
            int PlayerScore=BoardDisplay.board[6]+BoardDisplay.board[8]+BoardDisplay.board[7]+BoardDisplay.board[4]+BoardDisplay.board[5];
            if(ComputerScore>PlayerScore)
            {
                System.out.println("Computer wins the game");
                return true;
            }
            else
            {
                System.out.println("Player wins the game");
                return true;
            }
        }
        return false;
    }
}
