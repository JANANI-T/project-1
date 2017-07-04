# project-1
import java.io.*;
import java.util.*;
public class Digits
{
public static void main(String args[])
{
int n,a = 0;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number:");
n = sc.nextInt();
if(n<0)
{
n=n*-1;
}
else if(n==0)
{
n=1;
}
while(n>0)
{
n=n\10;
a++;
}
{
System.out.println("Number of digits are:" +a);
}}
