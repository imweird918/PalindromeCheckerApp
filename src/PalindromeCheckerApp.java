
import java.util.Stack;

class StackStrategy implements PalindromeStrategy {
    @Override
    public boolean check(String input) {
        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray()) {
            stack.push(c);
        }
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }
        return true;
    }
}
interface PalindromeStrategy {
    boolean check(String input);
}
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "level";

        // We can choose any strategy that implements PalindromeStrategy
        PalindromeStrategy strategy = new StackStrategy();

        boolean isPalindrome = strategy.check(input);

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}