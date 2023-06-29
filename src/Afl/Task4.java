package Afl;

import java.util.Scanner;

public class Task4 {
    @SuppressWarnings("resource")
	public static void main(String[]args){
        System.out.println("This is a simple interest rate calculator with an instance/scenario of a loan company that give loan with highest duration of 12 month.There are two interest rates 15% for short time loans(less than 6 months )and 25% intrest rate for loans longer than 6 months");
        Scanner input = new Scanner(System.in);
        System.out.print("input loan amount: ");
        int amount =input.nextInt();
        System.out.print("input how many months to repay loan: ");
        int months =input.nextInt();
        if (months > 12){
            System.out.println("Invalid input. Months should be between 1 and 12.");
            return;
        }
        int shortRate = 15;
        int longRate = 25;
        if (amount < 20_000 && months < 6 ) {
            System.out.println("You need a loan of " + amount  +" for a period of " + months + " months. The interest rate is "+ shortRate + "%" );
        } else if (amount > 20_000 && months > 6 ) {
            System.out.println("You need a loan of " + amount  +" for a period of " + months + " months. The interest rate is "+ longRate + "%" );

        }
        System.out.println("To continue press 1 to cancel press 2");
        int proceedWithLoan = input.nextInt();
        if (proceedWithLoan > 1){
            System.out.println("Thank you for using the simple interest calculator");
            return ;
        }
        if (months < 6 ){
            int  interestRate = (amount * shortRate) / 100;
            int total = amount  +  interestRate;
            String message = ("The interest rate of the loan amount is " +  interestRate);
            String message2 =("You are expected to repay N" + total);
            System.out.println(message);
            System.out.println(message2);
        } else if (months > 6 ){
            int  interestRate = (amount * longRate) / 100;
            int total = amount  +  interestRate;
            String message = ("The interest rate of the loan amount is " + interestRate);
            String message2 =("You are expected to repay N" + total);
            System.out.println(message);
            System.out.println(message2);
        }


    }
}
