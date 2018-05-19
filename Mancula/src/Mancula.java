import java.util.Scanner;

public class Mancula {
    private static Scanner sr = new Scanner(System.in);
    private static int[] boardItem = {3, 3, 3, 3, 3, 3, 3, 3, 3, 3};
    private static int huPlayer = 0;
    private static int coPlayer = 0;
    private static String dir = "R";
    private static int turn = 0;

    private static void intro() {
        System.out.print("\n\n*****Welcome to The Mancala Game*****");
        System.out.println("\n  ***Developed by: Anup Shrestha***");
    }

    private static void displayBoard() {
        System.out.println("\n\n" +
                "\tMancala Board:                                                 Position nos.:\n" +
                "|-----------------------------------------------|                  \n" +
                "|   |human|  <" + boardItem[9] + ">                 <" + boardItem[4] + ">  |compu|   |                  <10>                    <5>\n" +
                "|   |-----|       <" + boardItem[8] + ">       <" + boardItem[3] + ">       |-----|   |                        <9>          <4>\n" +
                "|   |  " + huPlayer + "  |            <" + boardItem[2] + ">            |  " + coPlayer + "  |   |                               <3>\n" +
                "|   |-----|       <" + boardItem[1] + ">       <" + boardItem[6] + ">       |-----|   |                        <2>          <7>\n" +
                "|   |-----|  <" + boardItem[0] + ">                 <" + boardItem[5] + ">  |-----|   |                  <1>                     <6>\n" +
                "|-----------------------------------------------|                  \n"
        );
    }

    private static void hPlay() {
        int pos;
        do {
            System.out.print("Enter the Position: ");
            pos = sr.nextInt() - 1;
            if (pos == 2) {
                do {
                    System.out.print("Enter the Direction (R or L): ");
                    dir = sr.next();
                    dir = dir.toUpperCase();
                    if (!(dir.equalsIgnoreCase("R") || dir.equalsIgnoreCase("L"))) {
                        System.out.println("Invalid Input, Try Again");
                    }
                } while (!(dir.equalsIgnoreCase("R") || dir.equalsIgnoreCase("L")));
            }
            if (pos < 10 && pos >= 0) {
                process(pos);
                break;
            } else {
                System.out.println("Wrong input");
            }
        } while (pos < 10 && pos >= 0);
    }

    private static void cPlay() {
        int great = 0, pos = 5;
        for (int i = 0; i < 10; i++) {
            if (i < 5) {
                if (boardItem[i] > (4 - i)) {
                    if (i == 3) {
                        dir = "R";
                    }
                    process(i);
                    break;
                }
            } else {
                if (boardItem[i] > great) {
                    great = boardItem[i];
                    pos = i;
                    if (pos == 7) {
                        pos = 3;
                        dir = "L";
                    }
                }
            }
        }
        process(pos);

    }


    private static void process(int n) {
        int temp;
        temp = boardItem[n];
        boardItem[n] = 0;
        if (n == 2 && dir.equalsIgnoreCase("L")) {
            n = 7;
        }
        n++;
        if (n == 10) {
            n = 0;
        }
        adder(n, temp);
        displayBoard();

    }

    private static void adder(int i, int temp) {
        if (!(i == 7)) {

            if (!(temp == 0)) {
                if (i == 5 && !(turn == 1)) {
                    coPlayer++;
                    temp--;
                    if (temp == 0) {
                        displayBoard();
                        cPlay();

                    }
                } else if (i == 0 && turn == 1) {
                    huPlayer++;
                    temp--;
                    if (temp == 0) {
                        displayBoard();
                        hPlay();

                    }
                }
                if (i >= 0 && temp != 0) {
                    boardItem[i]++;
                    temp--;
                }

                if (huPlayer == 5 || coPlayer == 5) {
                    displayBoard();
                    huPlayer = huPlayer + boardItem[0] + boardItem[1] + boardItem[8] + boardItem[9];
                    coPlayer = coPlayer + boardItem[3] + boardItem[4] + boardItem[5] + boardItem[6];
                    for (int j = 0; j < 10; j++) {
                        if (!(j == 2)) {
                            boardItem[j] = 0;
                        }
                    }
                }

                if (!(temp <= 0)) {
                    i++;
                    if (i >= 10) {
                        i = 0;
                    }
                    adder(i, temp);
                }
            }
        } else {
            boardItem[2]++;
            temp--;
            i++;
            adder(i, temp);
        }

    }

    private static boolean win() {
        if (huPlayer > 5 && coPlayer > 5) {
            if (huPlayer > coPlayer) {
                System.out.println("CONGRATULATION, YOU WIN");
            } else if (coPlayer > huPlayer) {
                System.out.println("SORRY, YOU LOSE");
            } else {
                System.out.println("its a tie");
            }
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        intro();
        String choice;
        do {
            System.out.print("Do You Want To Play First (Y/N): ");
            choice = sr.next();
            if (!choice.equalsIgnoreCase("Y") && !choice.equalsIgnoreCase("N")) {
                System.out.println("Invalid Input, Please try again");
            }
        } while (!choice.equalsIgnoreCase("Y") && !choice.equalsIgnoreCase("N"));
        choice = choice.toUpperCase();
        displayBoard();
        if (choice.equals("Y")) {
            turn = 1;
        }

        do {
            if (turn == 1) {
                hPlay();
                turn = 0;
            } else {
                cPlay();
                turn = 1;
            }
        } while (!win());

    }
}