# project-1
import java.io.*;
import java.util.*;
public class FactPlayer{  
  public static void main(String args[]){  
    int a,i,fact=1;  
    Scanner sc = new Scanner(System.in); 
    
    a = sc.nextInt();
    for(i=1;i<=a;i++){    
      fact=fact*i;    
    }    
    System.out.println(fact);    
  }  
}  
