# project-1
import java.io.*;
import java.util.*;
public class Prime
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int n,prime=0;
System.out.println("Enter the number:");
n = sc.nextInt();
if(n%2==0 && n>=2)
{
prime=0;
}
else
{
prime =1;
}
if(prime==0)
{
System.out.println("The given is Prime");
}
else
{
System.out.println("The given is not Prime");
}}
}
