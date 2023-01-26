package com.calculator;

import javax.swing.*;
import java.awt.*;

public class View extends JFrame {
	
	protected Model model = new Model();
	protected JLabel valueLabel = new JLabel();
	DigitList digitList;
	OpList opList;

	
	View() {
		
		setLayout(new FlowLayout() );
		for (int i=0; i<=9; i++) {
			JButton digitButton = new JButton( Integer.toString(i) ) ;
			digitButton.addActionListener( new DigitList( this, model, i ) ) ;
			add( digitButton ) ;
		}
		
//		String operationString[] = {"+", "-", "/", "=", "Clear"};
//		
//		for (String op: operationString) {
//			JButton digitButton = new JButton( op ) ;
//			digitButton.addActionListener( new DigitList( this, model, Op.op ) ) ;
//			add( digitButton ) ;
//		}
		
		JButton digitButtonPlus = new JButton("+") ;
		digitButtonPlus.addActionListener( new OpList( this, model, Op.ADD ) ) ;
		add( digitButtonPlus ) ;
		JButton digitButtonClear = new JButton("Clear") ;
		digitButtonClear.addActionListener( new OpList( this, model, Op.CLEAR ) ) ;
		add( digitButtonClear ) ;
		JButton digitButtonM = new JButton("-") ;
		digitButtonM.addActionListener( new OpList( this, model, Op.SUBTRACT ) ) ;
		add( digitButtonM ) ;
		JButton digitButtonD = new JButton("/") ;
		digitButtonD.addActionListener( new OpList( this, model, Op.DIVIDE ) ) ;
		add( digitButtonD ) ;
		JButton digitButtonClearEqual = new JButton("=") ;
		digitButtonClearEqual.addActionListener( new OpList( this, model, Op.EQUAL ) ) ;
		add( digitButtonClearEqual ) ;
		add(valueLabel);
		setSize(300,300) ;
		setVisible( true ) ;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) ;
		refresh();
		}
	void refresh() {
		valueLabel.setText( model.getResult() ) ; }

	public static void main(String[] args) {
		SwingUtilities.invokeLater( new Runnable() {
		@Override public void run() {
		new View() ;
		}} ) ;
	}

}
