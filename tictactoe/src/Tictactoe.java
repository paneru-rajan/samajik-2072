public class Tictactoe {

    static void DisplayFormat(int index) {
        char a[] = new char[]{' ',' ',' ',' ',' ',' ',' ',' ',' '};
//        char a[] = new char[]{'O','X','X','O','X','O','X','X','X'};
        a[index] = 'X';
        System.out.println(
                a[0]+"|"+a[1]+"|"+a[2]+
                "\n------\n"+
                a[3]+"|"+a[4]+"|"+a[5]+
                "\n------\n"+
                a[6]+"|"+a[7]+"|"+a[8]);
    }
    public static void main(String[] args){
        DisplayFormat(3);
        }
}
