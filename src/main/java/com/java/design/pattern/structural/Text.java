package com.java.design.pattern.structural;

public class Text implements Widget{
	
	private Markup markup;
	private ActionListener actionListener;
	
	public Text(Markup markup,ActionListener actionListener) {
		this.setMarkup(markup);
		this.setActionListener(actionListener);
	}

	@Override
	public void createWidget() {
		System.out.println("Text Widget created");
		
	}

	public ActionListener getActionListener() {
		return actionListener;
	}

	public void setActionListener(ActionListener actionListener) {
		this.actionListener = actionListener;
	}

	public Markup getMarkup() {
		return markup;
	}

	public void setMarkup(Markup markup) {
		this.markup = markup;
	}

}
