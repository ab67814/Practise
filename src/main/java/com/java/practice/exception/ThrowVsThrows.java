package com.java.practice.exception;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class ThrowVsThrows {
	
	public ThrowVsThrows() throws RuntimeException{
	}

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException, NoSuchMethodError, SQLException {

		getValue();
		getValueChecked();
		System.out.println("hi");
	}

	// do not neeed to handle unchecked or runtime excepton in caller method
	private static void getValue() throws RuntimeException, ArithmeticException, NullPointerException,
			ArrayIndexOutOfBoundsException, IndexOutOfBoundsException,ClassCastException,NumberFormatException {
		//int a = 10 / 0;
		if (true) {
			try {
				throw new RuntimeException();
			} catch (RuntimeException e) {
				System.out.println("runtimeexc");
			}
		}
	}

	// do not neeed to handle unchecked or runtime excepton in caller method
	private static void getValueChecked() throws IOException, FileNotFoundException,ClassNotFoundException,NoSuchMethodError,SQLException {
		int a = 10 / 0;
		System.out.println(a);
	}
}
