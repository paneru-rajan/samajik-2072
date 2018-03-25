public class Armstrong
{
    public static void main(String[] args)
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
}
