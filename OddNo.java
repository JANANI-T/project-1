# project-1
import java.io.*;
import java.util.*;

public class OddNo
{
public static void main(String org[])
{
Scanner sc = new Scanner(System.in);
int i,a,b;
System.out.println("Enter the starting number");
a= sc.nextInt();
System.out.println("Enter the ending number");
b= sc.nextInt();
for(i=a;i<b;i++){

if(i%2!=0)
{
System.out.println(i);
}
}
}
}
