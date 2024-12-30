//Take name as input and print a greeting message for that particular name.
package problem.Basic;
import java.util.Scanner;
public class welcome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.nextLine();
        System.out.println(name + " Welcome to you.");   
    }
    
}
