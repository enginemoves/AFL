package Afl;

public class Task8{
    public static void main(String[] args) {
        int[] numberA = {1, 2, 3, 4, 5, 6};
        int[] numberB = {34, 2, 9, 91, 19, 401, 0};

        System.out.println("Even numbers in the array:");
        for (int number : numberA) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }

        for (int number : numberB) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }
    }
}
