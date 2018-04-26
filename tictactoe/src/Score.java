public class Score {

    static int[] score = new int[9];

    static char scoreIntoValue(int score) {
        if(score == -1)
            return 'X';
        if(score == 1)
            return 'O';
        return ' ';
    }

    static void insert(int value, int index) {
        if(score[index] == 0) {
            score[index] = value;
        } else {
            System.out.println("Invalid Choice!!\n Position already filled");
            GameLogic.playerMove();
        }
        showFormat();
    }

    public static void showFormat() {
//        char score[] = new char[]{' ',' ',' ',' ',' ',' ',' ',' ',' '};
        System.out.println(
                        "\t "+scoreIntoValue(score[0])+"|"+scoreIntoValue(score[1])+"|"+scoreIntoValue(score[2])+
                        "\n\t-------\n\t "+
                        scoreIntoValue(score[3])+"|"+scoreIntoValue(score[4])+"|"+scoreIntoValue(score[5])+
                        "\n\t-------\n\t "+
                        scoreIntoValue(score[6])+"|"+scoreIntoValue(score[7])+"|"+scoreIntoValue(score[8]));
    }

    public static void main(String[] args) {
        showFormat();
    }
}
