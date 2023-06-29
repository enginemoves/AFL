package Afl;

public class Task10 {
    public static String toSentenceCase(String input) {
        if (input.isEmpty()) {
            return input; 
        }

        String firstLetter = input.substring(0, 1).toUpperCase();
        String remainingLetters = input.substring(1).toLowerCase();

        return firstLetter + remainingLetters;
    }

    public static void main(String[] args) {
        // Unit test
        String input = "hello, world!";
        String expected = "Hello, world!";
        String result = toSentenceCase(input);
        System.out.println("Input: " + input);
        System.out.println("Expected: " + expected);
        System.out.println("Result: " + result);
        System.out.println("Unit Test Passed: " + result.equals(expected));
    }
}
