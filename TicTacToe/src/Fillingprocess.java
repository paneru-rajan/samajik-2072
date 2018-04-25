public class Fillingprocess {

static int count=0;
    public static int minMax(int player) {  //initially player=-1
        int resUlt = Result.main(null);  //returns either -1 or 1 0r 0
        if (resUlt != 0) return resUlt * player; //if it is not 0 i.e either win condition of computer or player


        int move = -1;
        int score = -2;
        //checking for every possible best moves that can be done to make bad move for player
        for (int i = 0; i < 9; i++) {
            if (Box.boxArray[i] == 0) {
                Box.boxArray[i] = player;
                int tempScore = minMax(player * -1);
                tempScore=-tempScore;
                if (tempScore > score) {
                    score = tempScore;
                    move = i;

                }
                Box.boxArray[i] = 0;
            }

        }
        if (move == -1)
            return 0;
        else
            return score;
    }

    public static void computerMove() {
        int move = -1;  //set move to -1
        int score = -2; //set score to -2
        for (int i = 0; i < 9; i++) {
            if (Box.boxArray[i] == 0) {    //fill the array with computer value if the array is empty to check using minmax algorithm for best possible cases
                Box.boxArray[i] = 1;
                int tempScore = minMax(-1); // call the mimMax function with player value
                tempScore=-tempScore;
                Box.boxArray[i] = 0; //reset the above filled array to initial state
                if (tempScore > score) {
                    score = tempScore;
                    move = i;
                }
            }
        }
        Box.fillBox(1, move);
    }

    public static void main(String[] args) {

int checkResult=Result.main(null);
if(checkResult!=-1&&checkResult!=1)
        computerMove();
if(checkResult==1){
    System.out.print("Computer Win");
System.exit(0);}
if(checkResult==2) {
    System.out.print("You win");
System.exit(0);
}
    }


}