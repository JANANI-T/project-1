# project-1
import java.io.*;
import java.util.*;
public class Main
{

public static void main(String args[])
{
char c;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the Character:");
c = sc.next().charAt(0);
if((c>='a' && c<='z') || (c>='A' && c<='Z'))
{
System.out.println("The constant is an alphabet");
}
else
{
System.out.println("Not an Alphabet");
}
}
}

