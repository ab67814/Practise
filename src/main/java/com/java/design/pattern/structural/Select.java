package com.java.design.pattern.structural;

public class Select implements Widget {
	
	private Markup markup;
	private ActionListener actionListener;

	public Select(Markup markup,ActionListener actionListener) {
		this.setMarkup(markup);
		this.setActionListener(actionListener);
	}
	
	@Override
	public void createWidget() {
		System.out.println("select Widget created");
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
