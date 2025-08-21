//Write a C program to check whether character is an alphabet or not using conditional 
// operator.

package ConditionalOperator;
import java.util.Scanner;

public class AlphabetOrNot {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a character :");
        char ch = sc.next().charAt(0);

        String result = ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
        ? "Character is Alphabet" : "Not alphabet";

        System.out.println(result);

        
    }
}
