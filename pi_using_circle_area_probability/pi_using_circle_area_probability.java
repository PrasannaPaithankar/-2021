import java.util.*;
class pi_using_circle_area_probability
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        long i;
        double a=1,x,y,c=0,p,pi,r;
        while(a>0)
        {
            System.out.println("Enter radius");
            r=in.nextDouble();
            System.out.println("Enter precision");
            p=in.nextDouble();
            for(i=0;i<p;i++)
            {
                x=r*Math.random();
                y=r*Math.random();
                if(Math.sqrt((x*x)+(y*y))<=r)
                {
                    c++;
                }
            }
            pi=(4*(c/p));
            System.out.println(c);
            System.out.println("Value of pi = "+pi);
            c=0;
            System.out.println("Enter 1 to run again");
            System.out.println("Enter 0 to exit");
            a=in.nextDouble();
        }
    }
}  

                        
                        
                        
                        