public class Test {
    public static void main(String[] args){
        try{
          System.out.println(1/0);

        }
    catch(ArithmeticException e)
        {System.out.print(e.getStackTrace());
    }}}

