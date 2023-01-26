package com.calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.management.modelmbean.ModelMBean;

public class DigitList implements ActionListener{
	private Model model;
	private View view;
	private int i;

	public DigitList(View view, Model model, int num) {
		this.view = view;
		this.model = model;
		this.i = num;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		model.digit(i);
		view.refresh();
	}

}
