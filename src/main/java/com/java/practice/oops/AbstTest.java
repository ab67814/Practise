package com.java.practice.oops;

public class AbstTest implements FunctInterface {

	static void test() {

	}

	@Override
	public void computeExpression(int n) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getValue() {
		return "hi";
	}

	public static void main(String[] args) {
		FunctInterface abstTest = new AbstTest();
		System.out.println(abstTest.getValue());
		FunctInterface.computeSize();
		abstTest.abstra();
		new FunctInterface() {
			
			@Override
			public void computeExpression(int n) {
				// TODO Auto-generated method stub
				
			}
		};
		
		FunctInterface fun = (n) ->{
			System.out.println(n+10);
		};
		fun.computeExpression(2);
	}
}
