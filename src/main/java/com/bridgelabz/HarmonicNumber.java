package com.bridgelabz;
import java.util.Scanner;
public class HarmonicNumber {
    public static void main(String[] args) {
		System.out.println("Enter a number ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		double Harmonic = 0.0;
		for (int i = 1; i <= num; i++) {
			Harmonic = Harmonic + (double) 1 / i;
			System.out.println("Harmonic numbers are " + Harmonic);
		}
        sc.close();
	}
}
