public class ComputerMove {

    static int count = 0;

    public static int minMax(int player) {
        int result = Result.main(null);
        if (result != 0)   // checking if the game is already won or not
            return result * player;   // if result = 0  winning condition is already met and no need to play futher

        int move = -1;
        int score = -2;
        // checking for every possible move for computer
        // the idea behind checking good move is checking for bad move for player
        for (int i=0; i<9; i++) {
            if (Score.score[i] == 0) {
                Score.score[i] = player;
                int tempScore = minMax(player * -1);
                tempScore =-tempScore;
                if (tempScore > score) {
                    score = tempScore;
                    move = 1;

                }
                Score.score[i] = 0;

            }

        }
        if (move == -1)
            return 0;
        else
            return score;
    }

    public static void computerMove() {
        int move = -1;
        int score = -2;
        for (int i=0; i<9; i++) {
            if (Score.score[i] == 0) {   // checking for valid spaces in the box
                Score.score[i] = 1;
                int tempScore = minMax(-1);
                tempScore=-tempScore;
                Score.score[i] = 0;
                if (tempScore > score) {
                    score = tempScore;
                    move = 1;
                }
            }
        }

        Score.insert(1,move);
    }

    public static void main(String[] args) {
        int checkResult = Result.main(null);
        if (checkResult != -1 && checkResult != 1) {
            computerMove();
        }
        if (checkResult == 1) {
            System.out.println("Computer wins!!");
            System.exit(0);
        }
        if (checkResult == 2) {
            System.out.println("You win!!");
            System.exit(0);
        }
    }


}

