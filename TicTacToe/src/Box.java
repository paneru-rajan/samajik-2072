public class Box
{
static int[] boxArray=new int[9];

public static char drawBox(int convert)
{
    switch (convert) {
        case -1:
            return 'X';
        case 1: return 'O';

    }
return ' ';
}

 protected static void fillBox(int input, int arrayValue)
{

if(boxArray[arrayValue]==0) {

    boxArray[arrayValue] = input;
}
else
    {

        System.out.println("Position is Already Filled");
  process.playerProcess();

}

    System.out.println("---|---|---");


    System.out.println(drawBox(boxArray[0])+"    "+drawBox(boxArray[1])+"    "+drawBox(boxArray[2]));

    System.out.println("---|---|---");

    System.out.println(drawBox(boxArray[3])+"    "+drawBox(boxArray[4])+"    "+drawBox(boxArray[5]));

    System.out.println("---|---|---");

    System.out.println(drawBox(boxArray[6])+"    "+drawBox(boxArray[7])+"    "+drawBox(boxArray[8]));
    System.out.println("---------------------------------------------------------------------------------------");





}

    public static void main(String[] args) {


//empty box

    System.out.println("---|---|---");


        System.out.println(boxArray[0]+""+boxArray[1]+""+boxArray[2]);

        System.out.println("---|---|---");

        System.out.println(boxArray[3]+""+boxArray[4]+""+boxArray[5]);

        System.out.println("---|---|---");

        System.out.println(boxArray[6]+""+boxArray[7]+""+boxArray[8]);
        System.out.println("-------------------------------------------------------------------------------------------");



    }



}