public class BoardDisplay
{
    static int board[]=new int[12];
    public static void main()
    {
        System.out.print("\t<"+board[11]+">\t\t\t\t<"+board[5]+">"); //board
        System.out.println("\t\t\t\t10\t\t\t\t5");//position
        System.out.print("\t\t<"+board[10]+">\t\t<"+board[4]+">"); //board
        System.out.println("\t\t\t\t\t\t9\t\t4"); //position
        System.out.print(board[0]+")\t\t\t<"+board[3]+">\t\t\t("+board[6]); //board
        System.out.println("\t\t\t\t\t3"); //position
        System.out.print("\t\t<"+board[2]+">\t\t<"+board[8]+">"); //board
        System.out.println("\t\t\t\t\t\t2\t\t7");//position
        System.out.print("\t<"+board[1]+">\t\t\t\t<"+board[7]+">");
        System.out.println("\t\t\t\t1\t\t\t\t6");//position
        System.out.println("\tThe input position is given at right hand corner");
        System.out.println("\t\tPlease enter from the given options only\n");

    }
}
