
import java.util.Scanner;

public class TicTacToeWithComputer {
    private static String[] board = new String[9];
    private static Scanner input;
    private static String playerSymbol;
    private static boolean playersTurn = false;
    private static boolean gameOver = false;
    private static boolean tie = false;

    public static void main(String[] args) {
        intro();
        for (int i = 0; i < 9; i++) {
            board[i] = String.valueOf(i + 1);
        }

        input = new Scanner(System.in);
        String choice = "";
        do {
            if (!choice.equalsIgnoreCase("X") && !choice.equalsIgnoreCase("o")) {
                System.out.print("Choose your symbol( X or O ): ");
                choice = input.next();
                if (!choice.equalsIgnoreCase("X") && !choice.equalsIgnoreCase("o"))
                    System.out.println("Invalid input, Please try again!");
            }
        }while(!choice.equalsIgnoreCase("X") && !choice.equalsIgnoreCase("o"));
        if (choice.equalsIgnoreCase("x")) {
            playersTurn = true;
        } else {
            playersTurn = false;
        }
        playerSymbol = choice.toUpperCase();
        while (gameOver == false) {
            displayBoard();
            if (playersTurn) {
                pTurn();
                playersTurn = false;
                gameOver = over();
            } else {
                cTurn();
                playersTurn = true;
                gameOver = over();
            }
        }
        displayBoard();
        if (!tie) {
            if (!playersTurn) {
                System.out.println("Congratulation, You are the Winner");
            } else {
                System.out.print("Sorry, You Lose");
            }
        } else {
            System.out.print("This match is tie");
        }
    }

    static boolean over() {
        for (int i = 0; i < 8; i++) {
            String line = null;
            switch (i) {
                case 0:
                    line = board[0] + board[1] + board[2];
                    break;
                case 1:
                    line = board[3] + board[4] + board[5];
                    break;
                case 2:
                    line = board[6] + board[7] + board[8];
                    break;
                case 3:
                    line = board[0] + board[3] + board[6];
                    break;
                case 4:
                    line = board[1] + board[4] + board[7];
                    break;
                case 5:
                    line = board[2] + board[5] + board[8];
                    break;
                case 6:
                    line = board[0] + board[4] + board[8];
                    break;
                case 7:
                    line = board[2] + board[4] + board[6];
                    break;
            }
            if (line.equals("XXX")) {
                return true;

            } else if (line.equals("OOO")) {
                return true;
            }
        }
        int flag = 0;
        for (int i = 0; i < 9; i++) {
            if (board[i].equalsIgnoreCase("x") || board[i].equalsIgnoreCase("O")) {
                flag++;
            }
        }
        if (flag == 9) {
            tie = true;
            return true;
        }
        return false;
    }

    public static void pTurn() {
        System.out.println("***Turn of Human***");

        boolean goodinput = false;

        while (!goodinput) {
            System.out.print("Please enter the location on the board: ");
            String numberInput = input.next();
            int number = 0;
            try {
                number = Integer.parseInt(numberInput);
            } catch (NumberFormatException e) {
                System.out.println("Invalid Input, Please Try Again");
                continue;
            }
            if (number < 1 || number > 9) {
                System.out.println("Invalid Input, Please Try Again");
                continue;
            }
            if (board[number - 1].equalsIgnoreCase("x") || board[number - 1].equalsIgnoreCase("o")) {
                System.out.println("Location is already written, Please Try Again");
                continue;
            }
            board[number - 1] = playerSymbol;
            goodinput = true;

        }

    }

    static void cTurn() {
        System.out.println("***Turn of Computer***");

        boolean validlocation = false;

        int[] check = {
                0, 1, 2,
                3, 4, 5,
                6, 7, 8,
                0, 3, 6,
                1, 4, 7,
                2, 5, 8,
                0, 4, 8,
                2, 4, 6
        };
        for (int i = 0; i < 24; i += 3) {
            int flags = 0;
            for (int j = 0; j < 3; j++) {
                if (board[check[i + j]].equals(playerSymbol)) {
                    flags++;
                }
            }
            if (flags == 2) {
                for (int j = 0; j < 3; j++) {
                    if (!board[check[i + j]].equals(playerSymbol) && !board[check[i + j]].equals(playerSymbol.equalsIgnoreCase("X") ? "O" : "X")) {
                        board[check[i + j]] = playerSymbol.equalsIgnoreCase("X") ? "O" : "X";
                        validlocation = true;
                        break;
                    }
                }
                break;

            }

        }

        while (!validlocation) {
            int location = (int) (Math.random() * 9);
            if (!board[location].equalsIgnoreCase("x") && !board[location].equalsIgnoreCase("o")) {
                board[location] = playerSymbol.equalsIgnoreCase("X") ? "O" : "X";
                validlocation = true;
            }
        }

    }

    public static void displayBoard() {
        System.out.println("\n  " + board[0] + "  |  " + board[1] + "  |  " + board[2] + "\n" +
                "-----------------\n" +
                "  " + board[3] + "  |  " + board[4] + "  |  " + board[5] + "\n" +
                "-----------------\n" +
                "  " + board[6] + "  |  " + board[7] + "  |  " + board[8] + "\n");
    }


    public static void intro() {
        System.out.println("****Welcome To Tic Tac Toe Game!***");
        System.out.println("********By Anup Shrestha");
    }
}
