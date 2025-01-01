//Input a number and print all the factors of that number (use loops).
package problem.conditionals_loops;
import java.util.Scanner;
public class factors {
    public static void main(String[] args) {
        System.out.println("Enter the no. you want the factor of:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int factor;
        for(int i = 1; i<=n; i++){
            if(n%i == 0){
                System.out.print(i +" ");
            }
        }
        sc.close();
    }
    
}
