# project-1
import java.io.*;
import java.util.*;
public class Large
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int a,b,c,largest;
System.out.println("Enter the numbers:");
a = sc.nextInt();
b = sc.nextInt();
c = sc.nextInt();
if (a>=b && a>=c)
{
System.out.println("The largest number is " +a);
}
if (b>=a && b>=c)
{
System.out.pritnln("The largest number is " +b);
}
if (c>=a && c>=b)
{
System.out.println("The largest number is " +c);
}
}}
