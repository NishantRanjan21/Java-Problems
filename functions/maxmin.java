//Define two methods to print maximum and the minimum numbers respectively among three numbers entered by the users.
package problem.functions;
import java.util.Scanner;
public class maxmin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first no.");
        int num1 = sc.nextInt();
        System.out.println("Enter the second no.");
        int num2 = sc.nextInt();
        System.out.println("Enter the third no.");
        int num3 = sc.nextInt();
        compare(num1,num2,num3);
        sc.close();
    }
    public static void compare(int first, int second, int third){
        if(first >second && first > third){
            System.out.println(first +" is greatest amoung the three numbers");
        }
        else if(second > first && second > third){
            System.out.println(second +" is greatest amoung the three numbers");
        }
        else if(third > first && third > second){
            System.out.println(third +" is greatest amoung the three numbers");
        }
        else{
            System.out.println("Non of the numbers are the greatest each no. are equal.");
        }
    }
    
}
