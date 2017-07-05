# project-1

import java.util.Scanner;
 
class ArmsNo {
  
  public static void main(String[] args) {
    
    try {
      
      System.out.println("Enter Number 1");
      
      Scanner sc = new Scanner(System.in);
      
      int number1 = sc.nextInt();
      
      System.out.println("Enter Number 2");
      
      sc = new Scanner(System.in);
      
      int number2 = sc.nextInt();
      
      System.out.println("Armstrong Numbers between "+ number1 + " and " + number2);
      
      int n=0;
      
      for (int j=number1 ; j<=number2 ; j++)
      
      {
        
        int sum=0;
        
        int d=0;
        
        n=j;
        
        while (n>0)
        
        {
          
          d= n%10;
          
          sum=sum+d*d*d;
          
          n=n/10;
          
        }
        
        if (sum==j)
        
        {
          
          System.out.println(j +" ");
          
        }
        
      }
      
    }
    
    catch (Exception e)
    
    {
      
      System.out.println("Error");
      
    }
    
  }
  
}
