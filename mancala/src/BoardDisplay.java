public class BoardDisplay
{
    public static void main()
    {
        //computer's territory starts here
        System.out.print("\t");

        for (int i = 8; i < 14; i++)
            System.out.print(i + "\t");
        System.out.print("\n");
        for (int i = 8; i < 14; i++)
            System.out.print(MancalaGame.board[i] + "\t");
        //computer's territory ends here

        System.out.print(MancalaGame.board[7]+"\t\t\t\t\t\t");
        System.out.print(MancalaGame.board[0]);
        //player's territory starts here
        for (int i = 6; i > 0; i--)
            System.out.print(MancalaGame.board[i] + "\t");
        for (int i = 6; i > 0; i--)
        System.out.print(i + "\t");
        //player's territory ends here


    }
}
