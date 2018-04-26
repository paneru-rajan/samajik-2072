public class Result {
    static int[][] winConditions = new int[8][3];

    public static int main(String[] args) {
        int winConditions[][] = {{0,1,2} , {3,4,5}, {6,7,8}, {0,3,6},{1,4,7},{2,5,8},{0,4,8},{2,4,6}};
        for (int i=0; i<8; i++) {
            if (
                    Score.score[winConditions[i][0]] != 0 &&
                            Score.score[winConditions[i][0]] == Score.score[winConditions[i][1]] &&
                            Score.score[winConditions[i][0]] == Score.score[winConditions[i][2]] )
                return (Score.score[winConditions[i][2]]);
        }
        return 0;
    }

}
