package Afl;

public class Task7 {
    public static void main(String[] args) {
        int[] numberA = {1, 2, 3, 4, 5, 6};
        int[] numberB = {34, 2, 9, 91, 19, 401, 0};

        System.out.println("Odd numbers in the array:");
        for (int number1 : numberA) {
            if (number1 % 2 != 0) {
                System.out.println(number1);
            }
        }

        for (int number2 : numberB) {
            if (number2 % 2 != 0) {
                System.out.println(number2);
            }
        }
    }
}

