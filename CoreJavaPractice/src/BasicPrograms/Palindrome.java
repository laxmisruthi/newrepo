package BasicPrograms;

public class Palindrome {

	public static void main(String[] args) {
		int sum = 0, temp, rem;
		int num = 1221;
		temp = num;
		while (num > 0) {
			rem = num % 10;
			sum = (sum * 10) + rem;
			num = num / 10;
			// System.out.print(rem); // print reverse of number
		}
		if (temp == sum) {
			System.out.println(temp + " it is palindrome");
		} else {
			System.out.println(temp + " it is not a palindrome");

		}
	}
}
