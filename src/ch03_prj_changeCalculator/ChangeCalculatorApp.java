package ch03_prj_changeCalculator;

import java.util.Scanner;

public class ChangeCalculatorApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the change calculator");
		Scanner sc = new Scanner(System.in);

//variables
		String choice = "y";
		int quarters = 25;
		int dimes = 10;
		int nickles = 5;
		int pennies = 1;
		int piggyBank = 0;
		int myQuarters = 0;
		int myNickles = 0;
		int myDimes = 0;
		int myPennies = 0;
//while loop
		while (!choice.equalsIgnoreCase("n")) {
			System.out.print("Enter number of cents (0-99):\t");
			piggyBank = sc.nextInt();
//if statement
			if (piggyBank > quarters) {
				myQuarters = piggyBank / quarters;
				piggyBank = piggyBank - (myQuarters * quarters);
			}
			if (piggyBank > dimes) {
				myDimes = piggyBank / dimes;
				piggyBank = piggyBank - (myDimes * dimes);
			}
			if (piggyBank > nickles) {
				myNickles = piggyBank / nickles;
				piggyBank = piggyBank - (myNickles * nickles);
			}
			if (piggyBank > pennies) {
				myPennies = piggyBank / pennies;
				piggyBank = piggyBank - (myPennies * pennies);
//user output
			}
			System.out.println("Quaters:\t" + myQuarters);
			System.out.println("Dimes:\t        " + myDimes);
			System.out.println("Nickles:\t" + myNickles);
			System.out.println("Pennies:\t" + myPennies);
			System.out.println("Continue:\t(y/n)");
			choice = sc.next();
		}
		System.out.println("Goodbye");
		sc.close();
	}
}
