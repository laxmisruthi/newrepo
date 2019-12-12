package BasicPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fibonacci {

	public static void main(String[] args) {
		int a = 0, b = 1;
		int c;
		System.out.print(a + " " + b);

		for (int i = 2; i <= 10; i++) {
			// for (int i : values) {
			c = a + b;
			System.out.print(" " + c);
			a = b;
			b = c;

			// value.forecach(i -> system.out.println(i)){

		}
	}

}
