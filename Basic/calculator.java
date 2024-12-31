//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
package problem.Basic;
import java.util.Scanner;
public class calculator {
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the first no.:");
    float first = sc.nextFloat();
    System.out.println("Enter the second no.:");
    float second = sc.nextFloat();
    System.out.println("Enter the operation you want to do among: +, -, /, *:");
    char operator = sc.next().charAt(0);
    if(operator == '+'){
        System.out.println(first + second);
    }
    else if(operator == '-'){
        System.out.println(first - second);
    }
    else if(operator == '/'){
        System.out.println(first / second);
    }
    else{
        System.out.println(first * second);
    }
    sc.close();
}
    
}