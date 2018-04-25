import java.util.Scanner;
import java.util.Random;

public class process {
    static int chooseForS;
static int turn;
static int count=0;
    static Scanner scan = new Scanner(System.in);

    public static void playerProcess(){
        int checkResult=Result.main(null);
        if(checkResult!=-1&&checkResult!=1) {
            System.out.println("Enter position to fill (1-9)");
            int move = scan.nextInt();
            Box.fillBox(-1, move - 1);

        }
        if(checkResult==1){
            System.out.print("Computer Wins");
System.exit(0);}
        if(checkResult==2) {
            System.out.print("Human wins");
        System.exit(0);
        }


    }




    public static void main(String[] args) {
        chooseForS=scan.nextInt();

        {
            for (turn = 0; turn < 9; turn++) {

                if ((turn + chooseForS) % 2 == 0)
                    Fillingprocess.main(null);
                else
                    playerProcess();
            }


        }

System.out.print("Draw");

        }
    }












