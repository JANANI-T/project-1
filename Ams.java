# project-1
import java.util.Scanner;

public class Ams {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The No. To Find ArmStrong Check");
        int i = sc.nextInt();
        int sum = 0;
        for(int j = i; j>0 ; j = j/10){
            sum = sum + ((j%10)*(j%10)*(j%10));
        }
        if(sum == i)
            System.out.println("Armstrong");
        else
            System.out.println("Not Armstrong");

    }
}
