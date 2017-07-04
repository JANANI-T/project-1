# project-1
import java.io.*;
import java.util.*;
public class PosNegZero
{
public static void main(String args[])
{
int n;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number:");
n = sc.nextInt();
if(n>0)
System.out.println(n + " is Positive Number.");
else if(n<0)
System.out.println(n + " is Negative Number.");
else
System.out.println("It is Zero.");
}
}
