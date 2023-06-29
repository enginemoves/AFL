package Afl;

public class Task5 {
    public static void checkPalindrome(String word) {
        String reverseWord = "";
        for (int j = word.length() - 1; j >= 0; j--) {
            reverseWord = reverseWord + word.charAt(j);
        }
        if (reverseWord.equals(word)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }
    }

    public static void main(String[] args) {
        String word = "James";
        checkPalindrome(word);
    }
}
