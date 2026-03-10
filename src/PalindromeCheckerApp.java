public class PalindromeCheckerApp {

    public static void main(String[] args) {
        String input = "racecar";

        // Create an instance of the service
        PalindromeService service = new PalindromeService();

        // Use the service to check the palindrome
        boolean isPalindrome = service.checkPalindrome(input);

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}

class PalindromeService {
    /**
     * Checks whether the input string is a palindrome.
     */
    public boolean checkPalindrome(String input) {
        int start = 0;
        int end = input.length() - 1;

        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}