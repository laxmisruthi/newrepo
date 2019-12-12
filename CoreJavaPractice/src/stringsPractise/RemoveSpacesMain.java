package stringsPractise;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.imageio.IIOException;

public class RemoveSpacesMain {
	public static void main(String[] args) {

		String str = "this is laxmi sruthi";
		int count = 0;
		char str1[] = str.toCharArray();
		for (int i = 0; i < str1.length; i++) {
			if (str1[i] != ' ') {
				// count = count + 1;
				str1[count++] = str1[i];
			}
		}
		System.out.println(str1);

	}

}
