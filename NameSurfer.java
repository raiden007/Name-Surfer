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
		addActionListeners();
		String line = "Abraham 144 158 261 350 408 410 503 347 274 238 214";
		NameSurferEntry entry = new NameSurferEntry(line);
		
		
		int nameEnd = line.indexOf(" ");
		name = line.substring(0, nameEnd);
	
		String numbers = line.substring(nameEnd + 1);
		String startParsing = numbers;
		println("startParsing:" + startParsing);
		for (int i=0; i<NDECADES; i++) {
			int endDecade = startParsing.indexOf(" ");
			println("endDecade:"+endDecade);
			if (endDecade == -1) {
				decade = startParsing.substring(0);
				println("decade:" + decade);
			} else {
				decade = startParsing.substring(0, endDecade);
				println("decade:" + decade);
			}

			int decadeInt = Integer.parseInt(decade);
			println("decadeInt" + decadeInt);
			rankings[i] = decadeInt;
			println(rankings[i]);
			startParsing = startParsing.substring(endDecade + 1);
			println("new start parsing:" + startParsing);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		println(entry.getName());
//		for (int i=0; i<11; i++) {
//			println(entry.getRank(i));		
//		}

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
			println("Graph: " + tf.getText());
		} else if (e.getSource()==clear) {
			println("Clear button pressed");
		}
	}
	
	public JTextField tf;
	public JButton graph;
	public JButton clear;
	
	private String name;
	private int[] rankings = new int[NDECADES];
	private String decade;
}
