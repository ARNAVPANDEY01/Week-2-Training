//Q-3 Create a PalindromeChecker class with an attribute text.
//Create a class name PalindromeString
class Palindrome {

    // Create Attribute
    private String text;

    // Create Constructor
    Palindrome(String text) {
        this.text = text;
    }

    // Create boolean method to check is it palindrome or not
    public boolean isPalindrome() {
        int left = 0;
        int right = text.length() - 1;

        // Check by using while loop
        while (left < right) {
            if (text.charAt(left) != text.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Check condition by passing method
    public void displayResult() {
        if (isPalindrome()) {
            System.out.println("The text \"" + text + "\" is a palindrome.");
        } else {
            System.out.println("The text \"" + text + "\" is not a palindrome.");
        }
    }
}

public class PalindromeString {
    public static void main(String[] args) {

        // Create an object of Palindrome class
        Palindrome palindrome = new Palindrome("madam");
        palindrome.displayResult();

        Palindrome palindrome2 = new Palindrome("hello");
        palindrome2.displayResult();
    }
}
