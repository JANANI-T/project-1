# project-1
import java.io.*;
import java.util.*;
public class PowerCal
{
public static void main(String arg[])
	
   {
	
       long a,p,r=1;
	
       Scanner sc=new Scanner(System.in);
 
       System.out.println("enter number");
	  
       a=sc.nextLong();
 
       System.out.println("enter power");
	  
       p=sc.nextLong();
 
       if(a>=0&&p==0)
       {   
          r =1;
       }
       else if(a==0&&p>=1)
	{   
            r=0;
	} 
       else
	{ 
              for(int i=1;i<=p;i++)
	       { 
                   r=r *a;
 	 	}    
  	 }    
 
    	  System.out.println(a+"^"+p+"="+r);
 
    }
 
}
