package com.calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OpList implements ActionListener{
	
	private Model model;
	private View view;
	private Op i;
	
	public OpList(View view, Model model, Op i) {
		this.view = view;
		this.model = model;
		this.i = i;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
			model.operation(i);
			view.refresh();
	
	}

}
