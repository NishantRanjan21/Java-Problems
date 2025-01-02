//Define a function to check if the three given numbers are pythagorean triplet or not.
import java.util.Scanner;
public class pythatriplet {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first no.");
        int num1 = sc.nextInt();
        System.out.println("Enter the second no.");
        int num2 = sc.nextInt();
        System.out.println("Enter the third no.");
        int num3 = sc.nextInt();
        System.out.println(istriplet(num1, num2, num3));

    }
    public static boolean istriplet(int num1, int num2, int num3){
        if(num1*num1 == (num2*num2)+(num3*num3) ){
            return true;
        }
        else if(num2*num2 == (num1*num1)+(num3*num3) ){
            return true;
        }
        if(num3*num3 == (num2*num2)+(num1*num1) ){
            return true;
        }
        else{
            return false;
        }
    }
    
}
