import java.util.Scanner;
import java.util.Arrays;
import java.util.InputMismatchException;

public class TicTacToe {
    static Scanner sr = new Scanner(System.in);
    static String[] boxElement = new String[9];
    static String turnSign = "X";
    static String winner = null;

    static void enterElementInBox() {
        for (int a = 0; a < 9; a++) {
            boxElement[a] = String.valueOf(a + 1);
        }
    }

    static void printbox() {
        System.out.println(" " + boxElement[0] + " | " + boxElement[1] + " | " + boxElement[2] + "\n" +
                "------------\n" +
                " " + boxElement[3] + " | " + boxElement[4] + " | " + boxElement[5] + "\n" +
                "------------\n" +
                " " + boxElement[6] + " | " + boxElement[7] + " | " + boxElement[8] + "\n");
    }

    static String checkWinner() {
        for (int a = 0; a < 8; a++) {
            String line = null;
            switch (a) {
                case 0:
                    line = boxElement[0] + boxElement[1] + boxElement[2];
                    break;
                case 1:
                    line = boxElement[3] + boxElement[4] + boxElement[5];
                    break;
                case 2:
                    line = boxElement[6] + boxElement[7] + boxElement[8];
                    break;
                case 3:
                    line = boxElement[0] + boxElement[3] + boxElement[6];
                    break;
                case 4:
                    line = boxElement[1] + boxElement[4] + boxElement[7];
                    break;
                case 5:
                    line = boxElement[2] + boxElement[5] + boxElement[8];
                    break;
                case 6:
                    line = boxElement[0] + boxElement[4] + boxElement[8];
                    break;
                case 7:
                    line = boxElement[2] + boxElement[4] + boxElement[6];
                    break;
            }
            if (line.equals("XXX")) {
                return "X";
            } else if (line.equals("OOO")) {
                return "O";
            }
        }
        for (int a = 0; a < 9; a++) {
            if (Arrays.asList(boxElement).contains(String.valueOf(a + 1))) {
                break;
            } else if (a == 8) return "draw";
        }

        System.out.print(turnSign + "'s turn;\nEnter a slot number to place " + turnSign + " in: ");
        return null;
    }

    public static void main(String[] args) {
        enterElementInBox();
        System.out.println("\n\n!!!Welcome to The Tic Tac Toe Game!!!\n" +
                "-------------------------------------\n" +
                "2 Player\n" +
                "-------------------------------------\n\n" +
                "Preview of The Tic Tac Toe Box");
        printbox();
        System.out.print("\"X\" will be The First Player.\n" +
                "Enter The Slot no. to Place \"X\" in: ");
        while (winner == null) {
            int inputPos;
            try {
                inputPos = sr.nextInt();
                if (!(inputPos > 0 && inputPos <= 9)) {
                    System.out.print("Invalid Input; re-enter slot number: ");
                    continue;
                }

            } catch (InputMismatchException e) {
                System.out.print("Invalid Input; re-enter slot number: ");
                continue;
            }
            if (boxElement[inputPos - 1].equals(String.valueOf(inputPos))) {
                boxElement[inputPos - 1] = turnSign;
                if (turnSign.equals("X")) {
                    turnSign = "O";
                } else {
                    turnSign = "X";
                }
                printbox();
                winner = checkWinner();
            } else {
                System.out.println("Slot already taken; re-enter slot number:");
                continue;
            }
        }
        if (winner.equalsIgnoreCase("draw")) {
            System.out.println("It's a draw! Thanks for playing.");
        } else {
            System.out.println("Congratulations! " + winner + "'s have won! Thanks for playing.");
        }
//        System.out.print("Do you want to play again (y/n): ");
//        String a = sr.next();
//        if(a.equalsIgnoreCase("y")) {
//            System.out.print("\f\n\n\n\n\n\n\n");
//            main(null);
//        }
    }
}
