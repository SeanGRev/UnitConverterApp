package main;

import java.util.Scanner;

public class Converter {

	public static void main(String[] args) {
		
		// Variables
		int menuSelection = 0;
		double inputAmount, outputAmount;
		
		Scanner scan = new Scanner(System.in);
		
		
		while(menuSelection != 7) {
			
			displaySelectionMenu();
			menuSelection = scan.nextInt();
			
			switch (menuSelection) {
			case 1:
				System.out.print("Input number of Inches: ");
				inputAmount = scan.nextDouble();
				outputAmount = 2.54 * inputAmount;
				System.out.println("Number of Centimeters: " + outputAmount);
				break;
			case 2:
				System.out.print("Input number of Centimeters: ");
				inputAmount = scan.nextDouble();
				outputAmount = inputAmount/2.54;
				System.out.println("Number of Inches: " + outputAmount);
				break;
			case 3:
				System.out.print("Input number of Feet: ");
				inputAmount = scan.nextDouble();
				outputAmount = inputAmount * 0.3048;
				System.out.println("Number of Meters: " + outputAmount);
				break;
			case 4:
				System.out.print("Input number of Meters: ");
				inputAmount = scan.nextDouble();
				outputAmount = inputAmount/0.3048;
				System.out.println("Number of Feet: " + outputAmount);
				break;
			case 5:
				System.out.print("Input number of Miles: ");
				inputAmount = scan.nextDouble();
				outputAmount = inputAmount * 1.609344;
				System.out.println("Number of Kilometers: " + outputAmount);
				break;
			case 6:
				System.out.print("Input number of Kilometers: ");
				inputAmount = scan.nextDouble();
				outputAmount = inputAmount/1.609344;
				System.out.println("Number of Miles: " + outputAmount);
				break;
			}
			
		}
		System.out.println("\nConverter Closed");
		
	}
	
	public static void displaySelectionMenu() {
		System.out.println("\nPlease select an option:");
		System.out.println("1. Inches to Centimeters");
		System.out.println("2. Centimeters to Inches");
		System.out.println("3. Feet to Meters");
		System.out.println("4. Meters to Feet");
		System.out.println("5. Miles to Kilometers");
		System.out.println("6. Kilometers to Miles");
		System.out.println("7. Quit");
		System.out.print("Option Selection: ");
	}
	
}
