import java.util.Scanner;

public class TicTacToe {

    private static void Display_empty_format(){
        System.out.println("\t  | | \n\t-------\n\t  | | \n\t-------\n\t  | | ");
    }
    public static void main(String[] args){
        String player;
        Display_empty_format();
        Scanner read = new Scanner(System.in);
        System.out.println("Enter player's name:");
        player = read.nextLine();
        GameLogic.main(null);
        }
}
