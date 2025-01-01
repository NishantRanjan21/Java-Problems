//Take integer inputs till the user enters 0 and print the sum of all numbers
package problem.conditionals_loops;
import java.util.Scanner;
public class while_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        while(n != 0){
            sum += n;
            n = sc.nextInt();
        }
        System.out.println("The summ of all your inputs is: "+sum);
    }
    
}
