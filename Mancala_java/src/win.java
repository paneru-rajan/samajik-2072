public class win {
    public static boolean main(int humanPlayer,int computerPlayer) {
        {
            if (humanPlayer > 5 && computerPlayer > 5) {
                if (humanPlayer > computerPlayer) {
                    System.out.println("YOU WON");
                } else if (computerPlayer > humanPlayer) {
                    System.out.println("Nice try but YOU LOSE");
                } else {
                    System.out.println("Its a tie");
                }
                return true;
            }

            return false;
        }
    }
}

