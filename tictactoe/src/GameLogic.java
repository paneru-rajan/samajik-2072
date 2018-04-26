import java.util.Scanner;
import java.util.Random;
import java.lang.String;

public class GameLogic {
    static int turn;
    static int playerSelect;


    public static void playerMove() {

        int checkResult = Result.main(null);
        if (checkResult != 1 && checkResult != -1) {
            System.out.println("Enter valid choice: (1-9)");
            Scanner scan = new Scanner(System.in);
            int choice = scan.nextInt();
            Score.insert(-1, choice);

        }
        if (checkResult == 1) {
            System.out.println("Computer wins!!");
            System.exit(0);

        }
        if (checkResult == -1) {
            System.out.println("HUman wins!!");
            System.exit(0);
        }
    }


    public static void main(String[] args) {
        Random rand = new Random();
        // selecting first player randomly
        playerSelect = rand.nextInt(1);
        for(turn=0; turn<9; turn++) {
            if((turn + playerSelect)%2 == 0)
                playerMove();
            else
                ComputerMove.main(null);
        }

        System.out.println("Draw");
    }
}
