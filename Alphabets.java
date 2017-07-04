# project-1
import java.io.*;
import java.util.*;
public class Alphabets
{
  public static void main(String args[])
  {
    char c;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the letter:");
    c = sc.next().charAt(0);
    if((c>='A' && c<='Z') || (c>='a' && c<='z'))
    {
      switch(c)
      {
        case 'a':case 'e':case 'i':case 'o':case 'u':
        case 'A':case 'E':case 'I':case 'O':case 'U':
        System.out.println("The given letter is vowel");
        break;
      
      default:
      System.out.println("The given letter is consonant");
        break;
        }}
        
        
        
        
      }}
  

   
