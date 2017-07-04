# project-1
import java.io.*;
import java.util.*;
public class Year
{
public static void main(String args[])
{
int n;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the year:");
n = sc.nextInt();
if(n%4 == 0) && (n%100 != 0)
{
System.out.println("The given year is Leap year");
}
else if(n%100 == 0)
{
System.out.println("The year is not a leap year");
}
if(n%400 == 0)
{
System.out.println("The given year is a leap year");
}
else
{
System.out.println("The year is not a leap year");
}}}
