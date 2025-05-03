import java.io.*;
import java.util.*;

class practice {
    public static void main(String[] arg) {
        System.out.println(longestPalindrome("absabcbadacf"));
    }

    public static String longestPalindrome(String s) {
        if (s == null || s.length() == 0) return "";
        StringBuilder t = new StringBuilder();
        t.append("#");
        for (int i = 0; i < s.length(); i++) {
            t.append(s.charAt(i)).append("#");
        }

        String transformed = t.toString();
        int maxLen = 0;
        int centerIndex = 0;

        for (int i = 0; i < transformed.length(); i++) {
            int left = i - 1;
            int right = i + 1;
            int currentLen = 1;

            while (left >= 0 && right < transformed.length() && transformed.charAt(left) == transformed.charAt(right)) {
                currentLen += 2;
                left--;
                right++;
            }

            if (currentLen > maxLen) {
                maxLen = currentLen;
                centerIndex = i;
            }
        }

        int start = (centerIndex - maxLen / 2);
        int end = (centerIndex + maxLen / 2);
        StringBuilder result = new StringBuilder();
        for (int i = start; i <= end; i++) {
            if (transformed.charAt(i) != '#') {
                result.append(transformed.charAt(i));
            }
        }

        return result.toString();
    }
}