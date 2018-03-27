import java.util.Scanner;

public class Menu {


        private static int counter;

        public static boolean Fizz(int i ){
            return i%3==0;}
        public static boolean Buzz(int i)
        {
            return i%5==0;
        }


        public static void string(String s)
        {
            System.out.println("The reverse string is: " + new StringBuilder(s).reverse());
        }


    public static void Armstrong()
    {
        int i,j,j1,k,l,cube;
        System.out.println("The 3 digit Armstrong numbers are:");
        for(i=100;i<=999;i++)
        {
            j=i%10;
            j1=i/10;
            k=j1%10;
            l=i/100;
            cube= (j*j*j)+(k*k*k)+(l*l*l);
            if(i==cube)

                System.out.println(i);


        }

    }

    public static void Fibonacci(int i)
    {
        int k=0,a=1,b=1;
        System.out.print("1 1 ");
        while(k<=i)
        {
            k=a+b;
            if(k>=i)
            {
                break;
            }
            System.out.print(k + " " );
            a=b;
            b=k;

        }
    }


    public static void main(String[] args)
    {
        int i;


        do {
            System.out.println("\n*************** MENU ******************");
            System.out.println("1.FizzBuzz");
            System.out.println("2.Reverse");
            System.out.println("3.Armstrong Numbers");
            System.out.println("4.Fibonacci Number");
            System.out.println("4.Exit \n");

            System.out.println("Enter your choice:");
            Scanner sc = new Scanner(System.in);
            i=sc.nextInt();




            switch(i) {
                case 1:
                    for (counter = 1; counter <= 100; counter++) {
                        if (Fizz(counter) && Buzz(counter))
                            System.out.println("FizzBuzz");
                        else if (Fizz(counter))
                            System.out.println("Fizz");
                        else if (Buzz(counter))
                            System.out.println("Buzz");
                        else
                            System.out.println(counter);
                    }
                    break;
                case 2:
                    System.out.println("Enter the string to be reversed:");
                    Scanner word = new Scanner(System.in);
                    String line = word.nextLine();
                    string(line);
                    break;
                case 3:
                    Armstrong();
                    break;
                case 4:

                    Scanner sca = new Scanner(System.in);
                    System.out.println("Enter the number upto you want to print:");
                    int n= sc.nextInt();
                    Fibonacci(n);
                    break;
                case 5:
                    break;
            }




        }
        while(i!=5);

    }


}


