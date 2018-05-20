import javax.swing.*;

public class mancala {

    public static int[] totMar = {3,3,3,3,3,3,3,0,3,3,0,0};
    public static boolean flag = false;
    public static boolean repeat = false;



    public static void isBoard(){
        System.out.println("--------------------------\t\t POSITIONS :");
        System.out.println("  |-|\t<" + totMar[9] + ">\t\t<" + totMar[4] + ">\t|-| \t\t<9>\t\t<4>");
        System.out.println("  | |\t  <" + totMar[8] + "> <" + totMar[3]+">\t| | \t\t  <8> <3>");
        System.out.println("  |" + totMar[10]+ "|\t\t<"+totMar[2]+">\t\t|" +totMar[11] + "|\t\t\t    <2>" );
        System.out.println("  | |\t  <" + totMar[1] + "> <" + totMar[6]+">\t| | \t\t  <1> <6>");
        System.out.println("  |-|\t<" + totMar[0] + ">\t\t<" + totMar[5] + ">\t|-| \t\t<0>\t\t<5>");
        System.out.println("--------------------------");


    }

    public static void main(String[] args) throws InterruptedException {

        isBoard();
        System.out.println("Hello Player !! Your end is right and Computer's is left. Have a good Game");
        String yourTurnAgain = "";

        while (!flag) {
            while (!repeat){
                Integer binPos = (Integer.parseInt(JOptionPane.showInputDialog("Player, Chose the hole position : ")));


                movePlayer(binPos);
                System.out.println("You 3" +
                        "4choose position " + binPos);
                gameOver();
                isWinner();
                if (flag == true) {

                    System.exit(0);
                }
            }

            Thread.sleep(3000);

            if (comPosition() != 0) {
                Integer position = comPosition();
                moveCom(position);
                System.out.println("Computer chooses Position " + position);

            } else if (comPosition2() != 0) {
                Integer position1 = comPosition2();
                moveCom(position1);
                System.out.println("Computer chooses Position " + position1);

            } else if (comPosition3() != 0) {
                Integer position2 = comPosition3();
                moveCom(position2);
                System.out.println("Computer chooses  Position " + position2);

            }
                    gameOver();
                    isWinner();

        }
    }

    //  Defines the move of the player
    //<editor-fold desc ="Move of the Player">
    public static void movePlayer(Integer binPos){
       int j = 0;
       int k=0;
        String yourTurnAgain="";



        for(int i =binPos;i<binPos+totMar[binPos];i++) {
                k= i+1;
                j = (i+1)%10;
                totMar[j] = totMar[j] + 1;

            if(j==5 && binPos == 2){
                totMar[11] = totMar[11] + 1;
                totMar[binPos] = totMar[binPos] - 1;
                totMar[j] = totMar[j] -1 ;
                break;
            }
            if(j==5){
                totMar[11] = totMar[11] + 1;
                totMar[binPos] = totMar[binPos] - 1;


            }

        }


        if(k==5){
             repeat = false ;
            yourTurnAgain = "The value ends at your endpoint...so Your turn again";
        }
        else{
            repeat = true;
            yourTurnAgain = "";
        }

        totMar[2]= totMar[2] + totMar[7];
        totMar[binPos] = 0;
        isBoard();
        System.out.println(yourTurnAgain);



    }
   // </editor-fold>

    // Defines the move of the Computer
    //<editor-fold desc="Move of the Computer">
    public static void moveCom(Integer binPos){
        totMar[7] = 0;

        for(int i =binPos;i<binPos+totMar[binPos];i++) {

            int j = (i+1)%11;
            totMar[j] = totMar[j] + 1;


        }
        totMar[2]= totMar[2] + totMar[7];
        totMar[binPos] = 0;
        if(binPos == 7){
            totMar[2] = 0;
        }
        isBoard();
        repeat = false;


    }
    //</editor-fold>

    // Defines the position computer will choose first
    //<editor-fold desc="Computer Position 1">
    public static Integer comPosition(){
for(int i = 0;i<10;i++){
    if(i==7) {
        totMar[7] = totMar[2];
        if (totMar[i] + 1 == 10) {
            return i;

        }
    }
    else{
        if(totMar[i]+i == 10){
            return i;

        }



    }
}
return 0;
    }
    //</editor-fold>

    // Defines the position Computer will choose if first is not available
    //<editor-fold desc="Computer Position 2">
    public static Integer comPosition2(){
        int G = totMar[5];
        for(int i=5;i<10;i++){

            if(G<totMar[i+1]){
                G = totMar[i+1];
            }
        }
        for(int i=5;i<10;i++){
            if(G == totMar[i])
            {return i;
            }

        }

        return 0;
    }
    //</editor-fold>

    // Defines the position Computer will choose ig Secound is not available
    //<editor-folder desc="Computer Position 3">
    public  static Integer comPosition3(){
        for(int i=2;i<7;i++){
            if(totMar[i] !=0)
                return i;

        }
        return 0;
    }
    //</editor-fold>

    //Check if game is over !!
    //<editor-fold desc="IS GAME OVER ??"
    public static void gameOver(){
        if(totMar[10] == 5 || totMar[11]==5){
            flag = true;
        }


    }
    //</editor-fold>

    // Check Who won the game !!
    //<editor-folder desc="Who is Winner">
    public static void isWinner(){
        if(flag==true){
            Integer comTotal = totMar[9]+totMar[8] + totMar[2] + totMar[1] +totMar[0];
            Integer playerTotal = totMar[4] + totMar[3] + totMar[2] + totMar[6] + totMar[5];

            if(comTotal > playerTotal){
                System.out.println("Oh Your Bad!!!  Computer Won");
            }
            else{
                System.out.println("Congratulation !! You Won");
            }

        }
    }
    //</editor-fold>


}
