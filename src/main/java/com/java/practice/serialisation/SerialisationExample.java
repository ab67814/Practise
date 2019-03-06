package com.java.practice.serialisation;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerialisationExample implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 10490638362709673L;
	
	private String name;
	
	private Integer Id;
	
	private boolean isManager;
	
	public SerialisationExample(String name,Integer id,boolean isManager) {
		this.name = name;
		this.Id = id;
		this.isManager = isManager;
	}

	public static void main(String[] args) throws IOException {
		SerialisationExample serialisationExample = new SerialisationExample("ritesh",1,true);
		
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("C:\\Users\\ritesht\\Desktop\\file.txt"));
		
		objectOutputStream.writeObject(serialisationExample);
		objectOutputStream.close();
		objectOutputStream.flush();

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public boolean isManager() {
		return isManager;
	}

	public void setManager(boolean isManager) {
		this.isManager = isManager;
	}

}
