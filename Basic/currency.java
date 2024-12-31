//Input currency in rupees and output in USD.
package problem.Basic;
import java.util.Scanner;
public class currency {
    public static void main(String[] args) {
        System.out.println("Enter the amount of Indian currency you want to convert:");
        Scanner sc = new Scanner(System.in);
        double currency = sc.nextDouble();
        double USD = (double) (0.011698005 * currency);
        System.out.println("In USD it is: "+USD);
        sc.close();
    }
    
}
