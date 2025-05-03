import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        scanner.close();
        if (isPalindrome(inputString)) {
            System.out.println("The entered string is a palindrome.");
        } else {
            System.out.println("The entered string is not a palindrome.");
        }
    }
    private static boolean isPalindrome(String str) {
        String cleanStr = str.replaceAll("\\s", "").toLowerCase();
        String reverseStr = new StringBuilder(cleanStr).reverse().toString();

        return cleanStr.equals(reverseStr);
    }
}
