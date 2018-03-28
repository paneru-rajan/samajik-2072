public class Students {
    int rollno;
    String name;
    void insert(int r,String n){
        rollno=r;
        name=n;
    }
    void displayinformation()
    {System.out.println(rollno+" "+name);}}
    class teststudent{
        public static void main(String[] args){
            Students s1=new Students();
            Students s2=new Students();
            s1.insert(1001,"Anup");
            s2.insert(1002,"Suraj");
            s1.displayinformation();
            s2.displayinformation();
        }
    }



