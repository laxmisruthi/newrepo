package BasicPrograms;

public class PrimeNumbers {
	public static void main(String[] args) {
		int num = 3, temp = 0;
		for (int i = 2; i <= num - 1; i++) {
			if (num % i == 0) {
				temp = temp + 1;
				break;
			}
		}
		if (temp > 0) {
			System.out.println("number is not a prime");
		} else
			System.out.println("number is a prime");
	}
}
