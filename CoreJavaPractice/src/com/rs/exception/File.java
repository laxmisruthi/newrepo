package com.rs.exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.imageio.IIOException;

public class File {
	public static void main(String[] args) throws IOException {
		FileReader file = new FileReader("D:\\rajasri\\slendit");
		BufferedReader fileInput = new BufferedReader(file);

		// Print first 3 lines of file "C:\test\a.txt"
		for (int counter = 0; counter < 3; counter++)
			System.out.println(fileInput.readLine());

		fileInput.close();

	}

}
