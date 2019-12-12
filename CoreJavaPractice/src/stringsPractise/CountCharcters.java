package stringsPractise;

// count no.of characters in string without space
public class CountCharcters {
	public static void main(String[] args) {
		String str = "laxmi sruthi";
		char[] str1 = str.toCharArray();
		int len = str1.length;
		System.out.println("with space "+len);

		int count = 0;
		for (int i = 0; i < len; i++) {
			if (str1[i] != ' ') {
				str1[count++] = str1[i];
			}
		}
		System.out.println("remove space "+count);

	}

}
