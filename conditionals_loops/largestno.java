//Take integer inputs till the user enters 0 and print the largest number from all.
package problem.conditionals_loops;
import java.util.Scanner;
public class largestno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n2 = sc.nextInt();
        int temp = n2;
        int sum = 0;
        int greatestno = 0;
        while(n2 != 0){
            if(temp > n2){
                greatestno = temp;
            }
            else{
                greatestno = n2;
            }
            n2 = sc.nextInt();
           temp = greatestno;

        }
    
        System.out.println(greatestno +" is the greatest no. amoung all the inputs.");
    }
    
}
