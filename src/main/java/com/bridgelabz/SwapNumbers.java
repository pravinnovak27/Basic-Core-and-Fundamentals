package com.bridgelabz;
import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a first number");
		int number1 = scan.nextInt();
		System.out.println("Enter a second number");
		int number2 = scan.nextInt();
		int temp = 0;
		temp = number1;
		number1 = number2;
		number2 = temp;
		System.out.println("After Swapping");
		System.out.println("First number " + number1);
		System.out.println("Second number " + number2);
        scan.close();
	}
}
