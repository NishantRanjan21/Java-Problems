//Write a function that returns all the prime numbers between the two given numbers.
import java.util.Scanner;
public class primeno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first no. of the range:");
        int num1 = sc.nextInt();
        System.out.println("Enter the second no. of the range:");
        int num2 = sc.nextInt();
        primeno(num1, num2);
    }
    public static void primeno(int num1, int num2){
        for(int i = num1; i<=num2; i++){
            if(isprime(i) == true){
                System.out.print(i +" ");
            }
        }
    }
    public static boolean isprime(int num){
        if(num < 2){
            return false;
        }
        for(int i = 2;i<=Math.sqrt(num);i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
        
    }
}
