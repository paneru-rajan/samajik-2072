public class CheckValue {

    public static int main(String[] args) {
        int checkValue;
        for (int i = 1; i < 12; i++) {
            if (i == 6) continue;
            if (i == 9) continue;
            checkValue = InitialBoard.positions[i];
            if (i == 3) {
                if (checkValue == 3)
                    return i;

            }

        if(i>0&&i<6)
        {
            if(checkValue==(12-(i+1)))
                return i;

        }

        if(i>6&&i<12)

        {
            if(checkValue==(12-i))
                return i;
        }

        }




        return 0;
    }
}