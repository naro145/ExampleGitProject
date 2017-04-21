package com.cubic.training.loops;

public class OddAndEven {

	public static void main(String[] args) {
		System.out.println("Odd numbers:");
		for (int i = 0; i <= 20; i++) {
			if (i % 2 == 0) {
				continue;
			}
			System.out.println(i);
		}
		System.out.println("Even numbers:");
		for (int j = 0; j <= 20; j++) {
			if (j % 2 == 0) {
				System.out.println(j);
			}
		}
		PrimeNumber();
	}

	static void PrimeNumber() {
		String primeNumbers = "";

		for (int n = 1; n <= 50; n++) {
			int counter = 0;
			for (int m = n; m >= 1; m--) {
				if (n % m == 0) {
					counter = counter + 1;
				}
			}
			if (counter == 2) {
				primeNumbers = primeNumbers + n + " ";
			}
		}
		System.out.println("Prime numbers from 1 to 50:");
		System.out.println(primeNumbers);
	}
}
