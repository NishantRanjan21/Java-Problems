//Write a program to print whether a number is even or odd, also take input from the user.
package problem.Basic;
import java.util.Scanner;

public class evenodd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. which you want to cheack for even or odd:");
        int n = sc.nextInt();
        if(n%2==0){
            System.out.println((n +" is even number"));
        }
        else{
            System.out.println(n + " is odd number");
        }
    }    
}
