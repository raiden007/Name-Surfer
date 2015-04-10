/*
 * File: NameSurfer.java
 * ---------------------
 * When it is finished, this program will implements the viewer for
 * the baby-name database described in the assignment handout.
 */

import acm.program.*;
import java.awt.event.*;
import javax.swing.*;

public class NameSurfer extends Program implements NameSurferConstants {

/* Method: init() */
/**
 * This method has the responsibility for reading in the data base
 * and initializing the interactors at the bottom of the window.
 */
	public void init() {
	    // You fill this in, along with any helper methods //
		addInteractors();
		graphView = new NameSurferGraph();
		add(graphView);
		dataBase = new NameSurferDataBase("names-data.txt");
		addActionListeners();
	}

private void addInteractors() {
	JLabel label = new JLabel("Name: ");
	tf = new JTextField(20);
	tf.addActionListener(this);
	graph = new JButton("Graph");
	clear = new JButton("Clear");
	
	add(label,SOUTH);
	add(tf,SOUTH);
	add(graph,SOUTH);
	add(clear,SOUTH);
}

/* Method: actionPerformed(e) */
/**
 * This class is responsible for detecting when the buttons are
 * clicked, so you will have to define a method to respond to
 * button actions.
 */
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==graph || e.getSource()==tf) {
			String userEntered = tf.getText();
			NameSurferEntry rankings = dataBase.findEntry(userEntered);
			if(rankings != null) {
				graphView.addEntry(rankings);
				graphView.update();
			}
			tf.setText("");
		} else if (e.getSource()==clear) {
			graphView.clear();
			graphView.update();
		}
	}
	
	public JTextField tf;
	public JButton graph;
	public JButton clear;
	private NameSurferGraph graphView;
	private NameSurferDataBase dataBase;
}
