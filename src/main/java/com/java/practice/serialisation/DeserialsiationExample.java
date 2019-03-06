package com.java.practice.serialisation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserialsiationExample {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("C:\\Users\\ritesht\\Desktop\\file.txt"));
		SerialisationExample s = (SerialisationExample) in.readObject();
		
		System.out.println(s.getName() + " " + s.isManager());

		in.close();
	}

}
