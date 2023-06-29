package Afl;

public class Task9 {
	//function
    public static String toUpperCase(String input) {
        return input.toUpperCase();
    }

    public static void main(String[] args) {
        // Unit test
        String input = "Hello, afl";
        String expected = "HELLO, AFL";
        String result = toUpperCase(input);
        System.out.println("Input: " + input);
        System.out.println("Expected: " + expected);
        System.out.println("Result: " + result);
        System.out.println("Unit Test Passed: " + result.equals(expected));
    }
}
