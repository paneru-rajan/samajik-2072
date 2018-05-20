import java.util.Scanner;

public class mancala {
    private static Scanner scan = new Scanner(System.in);

    private static int[] boardItem = {3, 3, 3, 3, 3, 3, 3, 3, 3, 3};
    private static int humanPlayer = 0;
    private static int computerPlayer = 0;
    private static String direction = "R";
    private static int turn = 0;

    private static void hPlay() {
        int pos;
        do {
            System.out.print("Enter the Position: ");
            pos = scan.nextInt() - 1;
            if (pos == 2) {
                do {
                    System.out.print("Enter the Direction (R or L): ");
                    direction = scan.next();
                    direction = direction.toUpperCase();
                    if (!(direction.equalsIgnoreCase("R") || direction.equalsIgnoreCase("L"))) {
                        System.out.println("Invalid Input, Try Again");
                    }
                } while (!(direction.equalsIgnoreCase("R") || direction.equalsIgnoreCase("L")));
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
                        direction = "R";
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
                        direction = "L";
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
        if (n == 2 && direction.equalsIgnoreCase("L")) {
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
                    computerPlayer++;
                    temp--;
                    if (temp == 0) {
                        displayBoard();
                        cPlay();

                    }
                } else if (i == 0 && turn == 1) {
                    humanPlayer++;
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

                if (humanPlayer == 5 || computerPlayer == 5) {
                    displayBoard();
                    humanPlayer = humanPlayer + boardItem[0] + boardItem[1] + boardItem[8] + boardItem[9];
                    computerPlayer = computerPlayer + boardItem[3] + boardItem[4] + boardItem[5] + boardItem[6];
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

    private static void displayBoard() {
        System.out.println("\n\n" +
                "\tMancala Board:                                                 Position nos.:\n" +
                "|-----------------------------------------------|                  \n" +
                "|   |human|  <" + boardItem[9] + ">                 <" + boardItem[4] + ">  |compu|   |                  <10>                    <5>\n" +
                "|   |-----|       <" + boardItem[8] + ">       <" + boardItem[3] + ">       |-----|   |                        <9>          <4>\n" +
                "|   |  " + humanPlayer + "  |            <" + boardItem[2] + ">            |  " + computerPlayer + "  |   |                               <3>\n" +
                "|   |-----|       <" + boardItem[1] + ">       <" + boardItem[6] + ">       |-----|   |                        <2>          <7>\n" +
                "|   |-----|  <" + boardItem[0] + ">                 <" + boardItem[5] + ">  |-----|   |                  <1>                     <6>\n" +
                "|-----------------------------------------------|                  \n"
        );
    }

    public static void main(String[] args) {
        String choice;
        displayBoard();
        do {

            System.out.print("Do You Want To Play First (Y/N): ");
            choice = scan.next();
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
        } while (!win.main(humanPlayer,computerPlayer));

    }
}