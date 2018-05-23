
import java.util.Scanner;

public class FillUp {
    static String WhoIsPlaying = "player";
    static int positionToFill;
    static int getValue;
    static char leftOrRight;
static int referenceofPositionToFillUp;
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

referenceofPositionToFillUp=0;
        System.out.println("Enter Position  :::");
        positionToFill = scan.nextInt();

        if (positionToFill == 0 ||positionToFill==9|| positionToFill == 6 || positionToFill > 11) { //checking for invalid input
            System.out.println("Incorrect Input Enter Another Position");
            FillUp.main(null);

        }



       else if (positionToFill != 0 && positionToFill != 9 && positionToFill != 3 && positionToFill != 6) {//for input expect for middle box and endzones


            getValue = InitialBoard.positions[positionToFill];
            InitialBoard.positions[positionToFill] = 0;
            while (getValue != 0) {
                positionToFill++;

if(getValue==1)
{
    referenceofPositionToFillUp=positionToFill;
}

                if (positionToFill == 12) { //making array circular
                    positionToFill = 0;
                }

                if (positionToFill == 9) { //making 3 and 9 indexes of array seems similar
                    InitialBoard.positions[3] = InitialBoard.positions[3] + 1;
                    getValue--;
                    continue;
                }

                if (positionToFill == 6||positionToFill==0) { //filling end zones
                    FillUpEndZone.main(WhoIsPlaying, positionToFill);
                    continue;
                }
if(positionToFill!=0) { //expect for endzone of computer
    InitialBoard.positions[positionToFill] = InitialBoard.positions[positionToFill] + 1;
    getValue--;
}
            }

        }
        else {
            //if user produces the input to middle array
            System.out.println("Enter The direction to move either (left or right) ");
            leftOrRight = scan.next().charAt(0);
            //if user inputs right
            if (leftOrRight == 'R' || leftOrRight == 'r') {

                getValue = InitialBoard.positions[positionToFill];
                InitialBoard.positions[positionToFill] = 0;
                while (getValue != 0) {
                    positionToFill++;

                    if(getValue==1)
                    {
                        referenceofPositionToFillUp=positionToFill;
                    }

                    if (positionToFill == 12) { //making array circular
                        positionToFill = 0;
                    }

                    if (positionToFill == 9) { //making 3 and 9 indexs of array semms similar
                        InitialBoard.positions[3] = InitialBoard.positions[3] + 1;
                        getValue--;
                        continue;
                    }

                    if (positionToFill == 6||positionToFill==0) { //filling end zones
                        FillUpEndZone.main(WhoIsPlaying, positionToFill);
                        continue;
                    }


                    InitialBoard.positions[positionToFill] = InitialBoard.positions[positionToFill] + 1;
                    getValue--;
                }


            }

            //if user inputs left
            else if(leftOrRight=='L'||leftOrRight=='l')
            {
                getValue = InitialBoard.positions[positionToFill];
                InitialBoard.positions[positionToFill] = 0;
positionToFill=9;
                while (getValue != 0) {
                    positionToFill++;
                    if(getValue==1)
                    {
                        referenceofPositionToFillUp=positionToFill;
                    }

                    if (positionToFill == 12) { //making array circular
                        positionToFill = 0;
                    }

                    if (positionToFill == 9) { //making 3 and 9 indexs of array semms similar
                        InitialBoard.positions[3] = InitialBoard.positions[3] + 1;
                        getValue--;
                        continue;
                    }

                    if (positionToFill == 6||positionToFill==0) { //filling end zones
                        FillUpEndZone.main(WhoIsPlaying, positionToFill);
                        continue;
                    }

                    InitialBoard.positions[positionToFill] = InitialBoard.positions[positionToFill] + 1;
                    getValue--;
                }


            }

        }


    }
}
