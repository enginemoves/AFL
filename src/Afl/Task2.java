package Afl;
import java.util.Scanner;

public class Task2 {
    public static int calculatePower(int base, int exponent) {
        return (int) Math.pow(base, exponent);
    }
	@SuppressWarnings("resource")
	public static void main(String[] args) {
        //2. Create a function that calculates the power of a number. Then write a unit test to check the correctness of the function.

        System.out.println("This code takes user input. Please input a number and its power to calculate.");
        Scanner input = new Scanner(System.in);
        System.out.print("Input a number: ");
        int number = input.nextInt();
        System.out.print("Input the power number: ");
        int power = input.nextInt();

        int result = calculatePower(number, power);
        System.out.println("Result: " + result);

        // Unit test
        int expected = (int) Math.pow(number, power);
        System.out.println("Unit Test - Result: " + result + ", Expected: " + expected);
        System.out.println("Unit Test Passed: " + (result == expected));
    }

}
