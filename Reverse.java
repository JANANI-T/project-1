# project-1

import java.io.*;
import java.util.*;
public class Reverse
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
String input = sc.nextLine();
char[] x = input.toCharArray();
for (int i= x.length-1;i>=0;i--)
System.out.print(x[i]);
   }
}
