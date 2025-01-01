//To find Armstrong Number between two given number.
package problem.Basic;
import java.util.Scanner;
public class armstrong {
    public static void main(String[] args) {
        System.out.println("Enter the no. you want to check for armstrong no.:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count=0;
        int sum = 0;
        int temp = n;
        int number = n;
        int rem;
        while(temp>0){
            temp/=10;
            count++;
        }
        while(number>0){
            rem=number%10;
            sum +=Math.pow(rem, count);
            number /= 10;
        }
        if(n == sum){
            System.out.println(n +" is a armstrong no.");
        }
        else{
            System.out.println(n + " is not an armstrong no.");
        }
        sc.close();
    }
    
}
