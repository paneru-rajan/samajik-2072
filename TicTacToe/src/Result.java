public class Result
{

static int[][] wiNs=new int[8][3];
    public static int main(String[] args) {
        int winS[][] = {{0, 1, 2}, {3, 4, 5}, {6, 7, 8}, {0, 3, 6}, {1, 4, 7}, {2, 5, 8}, {0, 4, 8}, {2, 4, 6}};
        for (int i = 0; i < 8; i++) {
            if (Box.boxArray[winS[i][0]] != 0 &&
                    Box.boxArray[winS[i][0]] == Box.boxArray[winS[i][1]] &&
                    Box.boxArray[winS[i][0]] == Box.boxArray[winS[i][2]])
                return (Box.boxArray[winS[i][2]]); //returning value on array either 1 0r -1
        }
 return 0;


    }
    }



