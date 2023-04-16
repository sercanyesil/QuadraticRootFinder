import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		PrimeNumber pn = new PrimeNumber();
		System.out.println("Please write an integer number:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean isPrime = pn.isPrime(n);
		if (isPrime) {
			System.out.println(n + " is a prime number.");
		} else {
			System.out.println(n + " is not a prime number. Its first divider is " + pn.firstDivider(n) + ".");
		}
	}

	boolean isPrime(int n) {
		if (n < 2) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	int firstDivider(int n) {
		if (n < 2) {
			return -1;
		}
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return i;
			}
		}
		return n;
	}
}
