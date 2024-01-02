package accelerateSoftwareCompany;

public class PrintFirstNPrimeNumber {

	public static void main(String[] args) {
		int num = 15;
		printPrimeNumber(num);
	}

	private static void printPrimeNumber(int n) {
		int count = 0;
		int num = 2;
		while (count < n) {
			if (isPrime(num)) {
				System.out.print(num + " ");
				count++;
			}
			num++;
		}
	}

	private static boolean isPrime(int num) {
		if (num <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

}
