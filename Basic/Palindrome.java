//To find out whether the given String is Palindrome or not.
package problem.Basic;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Enter the word you want to check for:");
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        String revword = "";
        int a = 0;
        for(int i = word.length()-1;i >= 0;i--){
            revword = revword + word.charAt(i);
        }
        if (word.equals(revword)){
            System.out.println(word + " is a Palindrome.");
        }
        else{
            System.out.println(word + " is not a Palindrome.");
        }
        sc.close();

    }
    
}
