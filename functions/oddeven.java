//Define a program to check if the given input is odd or even.
import java.util.Scanner;
public class oddeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. you want to check for even or odd:");
        int num = sc.nextInt();
        System.out.println(isEven(num));
    }
    public static boolean isEven(int num){
        if(num % 2 == 0){
            return true;
        }
        else{
            return false;
        }
                
    }
    
}
