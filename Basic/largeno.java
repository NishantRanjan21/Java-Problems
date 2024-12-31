//Take 2 numbers as input and print the largest number.
package problem.Basic;
import java.util.Scanner;
public class largeno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first no.");
        int first = sc.nextInt();
        System.out.println("Enter the second no.");
        int second = sc.nextInt();
        if(first > second){
            System.out.println(first + " is greater than " + second);
        }
        else{
            System.out.println(second + " is greater than " + first);
        }
        sc.close();
        
    }
    
}
