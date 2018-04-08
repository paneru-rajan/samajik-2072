
public class Test {
    public static void main(String[] args){
        Object test = new Object();
        try{
            System.err.println(1/0);
        }
        catch (ArithmeticException e){
            System.err.println(e.getMessage());
        }
        catch (ClassNotFoundException)
    }
}
