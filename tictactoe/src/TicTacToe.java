import java.util.*;
public class TicTacToe {
    public static class Move {
        public int row;
        public int col;
    }

    static char player = 'x', opponent = 'o';

    //to check weather the board is emoty or not
    public static boolean IsMovesLeft(char board[][]) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    return true;
                }
            }
        }
        return false;
    }

    //  evaluation function
    public static int evaluate(char b[][]) {
        // Checking for Rows for X or O victory.
        for (int row = 0; row < 3; row++) {
            if (b[row][0] == (b[row][1]) && b[row][1] == (b[row][2])) {
                if (b[row][0] == (player)) {
                    return +10;
                } else if (b[row][0] == (opponent)) {
                    return -10;
                }
            }
        }
        // Checking for Columns for X or O victory.
        for (int col = 0; col < 3; col++) {
            if (b[0][col] == (b[1][col]) && b[1][col] == (b[2][col])) {
                if (b[0][col] == (player)) {
                    return +10;
                } else if (b[0][col] == (opponent)) {
                    return -10;
                }
            }
        }
        // Checking for Diagonals for X or O victory.
        if (b[0][0] == (b[1][1]) && b[1][1] == (b[2][2])) {
            if (b[0][0] == (player)) {
                return +10;
            } else if (b[0][0] == (opponent)) {
                return -10;
            }
        }

        if (b[0][2] == (b[1][1]) && b[1][1] == (b[2][0])) {
            if (b[0][2] == (player)) {
                return +10;
            } else if (b[0][2] == (opponent)) {
                return -10;
            }
        }

        // Else if none of them have won then return 0
        return 0;
    }

    // minimax
    public static int minimax(char board[][], int depth, boolean isMax) {
        int score = evaluate(board);


        if (score == 10) {
            return score;
        }


        if (score == -10) {
            return score;
        }
        if (IsMovesLeft(board) == false) {
            return 0;
        }
        if (isMax) {
            int best = -1000;

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {

                    if (board[i][j] == (' ')) {

                        board[i][j] = player;


                        best = Math.max(best, minimax(board, depth + 1, !isMax));


                        board[i][j] = ' ';
                    }
                }
            }
            return best;
        } else {
            int best = 1000;

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {

                    if (board[i][j] == (' ')) {

                        board[i][j] = opponent;


                        best = Math.min(best, minimax(board, depth + 1, !isMax));


                        board[i][j] = ' ';
                    }
                }
            }
            return best;
        }
    }

    public static Move findBestMove(char board[][]) {
        int bestVal = -1000;
        Move bestMove = new Move();
        bestMove.row = -1;
        bestMove.col = -1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == (' ')) {

                    board[i][j] = player;

                    int moveVal = minimax(board, 0, false);


                    board[i][j] = ' ';


                    if (moveVal > bestVal) {
                        bestMove.row = i;
                        bestMove.col = j;
                        bestVal = moveVal;
                    }
                }
            }
        }

        return bestMove;
    }

    public static void main(String[] args) {

        char[][] board =
                {
                        {' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}
                };
        System.out.println("TIC-TAC-TOE");
        System.out.println("1" + "|" + "2" + "|" + "3");
        System.out.println("-" + "|" + "-" + "|" + "-");
        System.out.println("4" + "|" + "5" + "|" + "6");
        System.out.println("-" + "|" + "-" + "|" + "-");
        System.out.println("7" + "|" + "8" + "|" + "9");
        int fc = 0;
        Scanner scan = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        Scanner an = new Scanner(System.in);
        System.out.println("Wanna go first(Y/N)?");
        char per = sc.next().charAt(0);
        if (per == 'Y' || per == 'y') {
            fc = 1;
        }
        do {
            if (fc % 2 == 1) {
                fc++;
                System.out.println("YOUR TURN!");
                int in = scan.nextInt();
                if (in == 1)
                    board[0][0] = player;
                else if (in == 2)
                    board[0][1] = player;
                else if (in == 3)
                    board[0][2] = player;
                else if (in == 4)
                    board[1][0] = player;
                else if (in == 5)
                    board[1][1] = player;
                else if (in == 6)
                    board[1][2] = player;
                else if (in == 7)
                    board[2][0] = player;
                else if (in == 8)
                    board[2][1] = player;
                else if (in == 9)
                    board[2][2] = player;
                PrintBoard(board);
            } else {
                fc++;
                Move bestMove = findBestMove(board);
                System.out.print("Computer's turn:\n");
                //System.out.printf("ROW: %d COL: %d\n\n", bestMove.row, bestMove.col);
                board[bestMove.row][bestMove.col] = opponent;
                PrintBoard(board);
            }
            if (wincheck(board) == 0)
                break;
        } while (IsMovesLeft(board));
    }

    public static void PrintBoard(char board[][]) {
        System.out.println(board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
        System.out.println("-" + "|" + "-" + "|" + "-");
        System.out.println(board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
        System.out.println("-" + "|" + "-" + "|" + "-");
        System.out.println(board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
    }
    public static int wincheck(char board[][]){
        //checking rows
        for(int row=0;row<3;row++)
        {
            if(board[row][0]==(board[row][1]) && board[row][1]==(board[row][2]))
            {
               {
                if(board[row][0]==(player)){
                    System.out.println("YOU WON!");
                return 0;}
                }
                if(board[row][0]==(opponent))
                   {
                   System.out.println("COMPUTER WON!");
                 return 0;
                   }
        }
    }
//checking columns
        for(int col=0;col<3;col++)
        {
            if(board[0][col]==(board[1][col]) && board[1][col]==(board[2][col])){
                if(board[0][col]==(player)){
                    System.out.println("YOU WON!");
                    return 0;
                }else if(board[0][col]==(opponent)){
                    System.out.println("COMPUTER WINS!");
                    return 0;
                }
            }
        }
    //for diagonals
        if(board[0][0]==(board[1][1]) && board[1][1]==(board[2][2]))
    {if(board[0][0]==(player)){
                System.out.println("YOU WON!!");
                return 0;
    }
    else if(board[0][0]==(opponent)){
        System.out.println("COMPUTER WINS!!");
        return 0;
    } }
      if(board[0][2]==(board[1][1]) && board[1][1]==(board[2][0]))

    {
        if (board[0][2] == (player)) {
            System.out.println("YOU WON!!");
            return 0;
        } else if (board[0][2] == (opponent)) {
            System.out.println("COMPUTER WINS!!");
            return 0;
        }

    }return 1;
    }
}