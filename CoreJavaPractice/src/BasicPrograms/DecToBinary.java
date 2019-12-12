package BasicPrograms;

public class DecToBinary {

	public static void main(String[] args) {

		int num = 59, rem;

		String x = " ";
		while (num > 0) {
			rem = num % 2;
			x = rem + " " + x;
			num = num / 2;
		}
		System.out.print(x);

	}

}
