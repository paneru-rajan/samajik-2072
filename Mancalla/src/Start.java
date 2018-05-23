
import java.sql.Time;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Start {
static Scanner scan=new Scanner(System.in);
    public static void main(String[] args) {

        InitialBoard.main(null);

        System.out.println("\nDo you want to go first(1) or second (2)");
int firstOrSecond=scan.nextInt();





for(int turn = firstOrSecond; turn< 1000; turn++) {
 if(turn%2!=0) {
     FillUp.main(null);
     InitialBoard.modifiedBoard();
     CheckResult.main(null);
while(FillUp.referenceofPositionToFillUp==6)
{
    System.out.println("Player Got Another chance");
FillUp.main(null);
InitialBoard.modifiedBoard();
CheckResult.main(null);


}

 }








 else {

try{

    Thread.sleep(2000);

}
catch (InterruptedException e)
{


}


     ComputerFillup.main(null);


    InitialBoard.modifiedBoard();
CheckResult.main(null);
     while(ComputerFillup.getreferanceOfDistance==0)
{

    System.out.println("Computer Got Another Chance");

    try{

        Thread.sleep(2000);

    }
    catch (InterruptedException e)
    {



    }
    ComputerFillup.main(null);
    InitialBoard.modifiedBoard();
CheckResult.main(null);
}
 }
 }
    }
}
