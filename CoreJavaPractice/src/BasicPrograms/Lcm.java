package BasicPrograms;

import java.util.Scanner;

public class Lcm {

	public static void main(String[] args) {
		int a, b, max, step, lcm = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("enter 1st number:");
		a = s.nextInt();
		System.out.println("enter 2nd number:");
		b = s.nextInt();
		if (a > b) {
			max = step = a;
		} else {
			max = step = b;
		}
		while (a != 0) {
			if (max % a == 0 && max % b == 0) {
				lcm = max;
				break;
			} else {
				max += step;
			}
		}
		System.out.println("Lcm of 2 numbers is:" + lcm);

	}

}
