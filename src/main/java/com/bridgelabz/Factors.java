package com.bridgelabz;
import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
		System.out.println("Enter a number ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("Factor of " + num + " is");
		for (int i = 2; i <= num; i++) {
			while (num % i == 0) {
				num /= i;
				System.out.print(i + " ");
			}
		}
        sc.close();
	}
}
