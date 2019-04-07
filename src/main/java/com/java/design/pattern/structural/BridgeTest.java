package com.java.design.pattern.structural;

public class BridgeTest {

	public static void main(String[] args) {
		Widget textWidget = new Text(new Markup(),new ActionListener());
		textWidget.createWidget();
		Widget selectWidget = new Text(new Markup(),new ActionListener());
		selectWidget.createWidget();
	}

}
