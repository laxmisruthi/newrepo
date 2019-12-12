package stringsPractise;

import java.util.Arrays;

public class Duplicate {

	public static void main(String[] args) {
		String s = "iam living in hydrabad";
		int index = 0,j;
		char str[] = s.toCharArray();
		for (int i = 0; i < str.length; i++) {
			for ( j = 0; j < i; j++) {
				if (str[i] == str[j]) {
					break;
				}
			}
			if (j == i) {
				str[index++] = str[i];
			}

		}
		System.out.print(String.valueOf(Arrays.copyOf(str, index)));
	}

}
