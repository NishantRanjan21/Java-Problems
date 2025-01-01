//Factorial Program In Java
package problem.conditionals_loops;
import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want factorial of:");
        int num = sc.nextInt();
        int fact = 1;
        for(int i = num; i > 0; i--){
            fact = fact * i;
        }
        System.out.println("The factorial of " + num + " is " + fact);
        
    }
}
