//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest
package problem.Basic;
import java.util.Scanner;
public class simpleintrest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of principal:");
        int principal = sc.nextInt();
        System.out.println("Enter the value of time");
        int time = sc.nextInt();
        System.out.println("Enter the value of Rate");
        int Rate = sc.nextInt();
        int simpleintrest = principal*time*Rate/100;
        System.out.println("Simple Interest = "+ simpleintrest);
        sc.close();
    }
}