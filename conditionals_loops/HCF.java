//HCF Of Two Numbers Program
package problem.conditionals_loops;
import java.util.Scanner;
public class HCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 2 no. of which you want HCF");
        System.out.println("Enter the first no.");
        int num1 = sc.nextInt();
        System.out.println("Enter the second no.");
        int num2 = sc.nextInt();
        while(num2 != 0){
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        System.out.println("The HCF is "+ num1);
    }
    
}
