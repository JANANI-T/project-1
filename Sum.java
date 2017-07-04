# project-1
import java.io.*;
import java.util.*;
public class Sum
{
public static void main(String args[])
{
int n,i=1;
int sum = 0;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the numbers");
n = sc.nextInt();
while(i <= n)
{
sum = sum + i;
i++;
}
System.out.println("The sum of "+n+" numbers are " +sum);
}}
