public class ComputerFillup {
    static String WhoIsPlaying = "computer";
    static int getValue;
    static int getreferanceOfDistance;


    public static void main(String[] args) {

        int getMaX = 0;
        int getDistance = 1;
        int getSum = 0;
        getreferanceOfDistance = 1;
        int checkedValue = CheckValue.main(null);
        if (checkedValue != 0) {
            getDistance = checkedValue; //if computer can get another chance by filling last marbel to end zone
        } else {

            for (int j = 4; j < 9; j++) {

                if (j == 6) continue;
                getSum = getSum + InitialBoard.positions[j];    //if there is no values to move in players space

            }
            if (getSum == 0) {
                for (int i = 2; i < 12; i++) {
                    if (i == 4 || i == 5 || i == 6 || i == 7 || i == 8 || i == 9 || i == 10) continue;
                    if (InitialBoard.positions[i] < InitialBoard.positions[i - 1]) { //if there is no value to move in player space
                        getDistance = i;                                            //selecting position with less value in computers zone


                    } else {

                        getDistance = i - 1;
                    }
                }
            }

//if get sum is not equla to zero

            for (int i = 4; i < 9; i++) {
                if (i == 6) continue;

                if (getMaX <= InitialBoard.positions[i]) { //getting greatest value in array



                    getMaX = InitialBoard.positions[i];   //taking position as greatest value in player space
                    getDistance = i;
                }


            }
        }


        System.out.println("Computer Selected Position:::"+getDistance);

//all about moves
        if (getDistance != 3 && getDistance != 9) {

            getValue = InitialBoard.positions[getDistance];
            InitialBoard.positions[getDistance] = 0;
            while (getValue != 0) {
                getDistance++;

                if (getDistance == 12) { //making array circular
                    getDistance = 0;
                }


                if (getValue == 1) {
                    getreferanceOfDistance = getDistance;
                }

                if (getDistance == 9) { //making 3 and 9 indexes of array seems similar
                    InitialBoard.positions[3] = InitialBoard.positions[3] + 1;
                    getValue--;
                    continue;
                }

                if (getDistance == 6 || getDistance == 0) { //filling end zones
                    FillUpEndZone.main(WhoIsPlaying, getDistance);
                    continue;
                }
                if (getDistance != 6) { //expect for endzone of player
                    InitialBoard.positions[getDistance] = InitialBoard.positions[getDistance] + 1;
                    getValue--;
                }
            }


        } else {

            if (getDistance == 3 || getDistance == 9) {
                getValue = InitialBoard.positions[getDistance];
                InitialBoard.positions[getDistance] = 0;
                getDistance = 9;
                while (getValue != 0) {
                    getDistance++;


                    if (getDistance == 12) { //making array circular
                        getDistance = 0;
                    }
                    if (getValue == 1) {
                        getreferanceOfDistance = getDistance;
                    }


                    if (getDistance == 9) { //making 3 and 9 indexs of array semms similar
                        InitialBoard.positions[3] = InitialBoard.positions[3] + 1;
                        getValue--;
                        continue;
                    }

                    if (getDistance == 6 || getDistance == 0) { //filling end zones
                        FillUpEndZone.main(WhoIsPlaying, getDistance);
                        continue;
                    }
                    if (getDistance != 6) {
                        InitialBoard.positions[getDistance] = InitialBoard.positions[getDistance] + 1;
                        getValue--;
                    }

                }
            }


        }
    }
}