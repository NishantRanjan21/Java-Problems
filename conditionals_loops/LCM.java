//LCM Of Two Numbers
package problem.conditionals_loops;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 2 no. of which you want LCM");
        System.out.println("Enter the first no.");
        int num1 = sc.nextInt();
        int temp1 = num1;
        System.out.println("Enter the second no.");
        int num2 = sc.nextInt();
        int temp2 = num2;
        while(num2 != 0){
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
                int LCM = Math.abs(temp1 * temp2)/num1;
                System.out.println("The LCM of the 2 no. are: " + LCM);
    }
    
}
