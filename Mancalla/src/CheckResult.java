public class CheckResult {


    public static void main(String[] args) {

        if(InitialBoard.positions[0]>4||InitialBoard.positions[6]>4)
        {
            System.out.println("Game Over");
            InitialBoard.positions[0]=InitialBoard.positions[1]+InitialBoard.positions[2]+InitialBoard.positions[10]+InitialBoard.positions[11];
            InitialBoard.positions[6]=InitialBoard.positions[4]+InitialBoard.positions[5]+InitialBoard.positions[7]+InitialBoard.positions[8];
   if(InitialBoard.positions[0]==InitialBoard.positions[6])
   {
       System.out.println("Draw");
   }

    if(InitialBoard.positions[0]>InitialBoard.positions[6])
        System.out.println("Computer Wins");
    else
        System.out.println("Player Wins");
     InitialBoard.modifiedBoard();
        System.exit(0);
        }

    }
}
