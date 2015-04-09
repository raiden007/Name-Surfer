/*
 * File: NameSurferGraph.java
 * ---------------------------
 * This class represents the canvas on which the graph of
 * names is drawn. This class is responsible for updating
 * (redrawing) the graphs whenever the list of entries changes or the window is resized.
 */

import acm.graphics.*;
import java.awt.event.*;
import java.util.*;
import java.awt.*;

public class NameSurferGraph extends GCanvas
	implements NameSurferConstants, ComponentListener {

	/**
	* Creates a new NameSurferGraph object that displays the data.
	*/
	public NameSurferGraph() {
		addComponentListener(this);
		//	 You fill in the rest //
		GLine oneLine = new GLine (0,0,0,APPLICATION_HEIGHT);

		GLine twoLine = new GLine(APPLICATION_WIDTH / 10,0,APPLICATION_WIDTH / 10,APPLICATION_HEIGHT);

		int threeX = 2*(APPLICATION_WIDTH / 10);
		GLine threeLine = new GLine (threeX,0,threeX,APPLICATION_HEIGHT);
		
		int fourX = 3*(APPLICATION_WIDTH / 10);
		GLine fourLine = new GLine (fourX,0,fourX,APPLICATION_HEIGHT);
		
		int fiveX = 4*(APPLICATION_WIDTH / 10);
		GLine fiveLine = new GLine (fiveX,0,fiveX,APPLICATION_HEIGHT);
		
		int sixX = 5*(APPLICATION_WIDTH / 10);
		GLine sixLine = new GLine (sixX,0,sixX,APPLICATION_HEIGHT);
		
		int sevenX = 5*(APPLICATION_WIDTH / 10);
		GLine sevenLine = new GLine (sevenX,0,sevenX,APPLICATION_HEIGHT);
		
		int eightX = 6*(APPLICATION_WIDTH / 10);
		GLine eightLine = new GLine (eightX,0,eightX,APPLICATION_HEIGHT);
		
		int nineX = 7*(APPLICATION_WIDTH / 10);
		GLine nineLine = new GLine (nineX,0,nineX,APPLICATION_HEIGHT);
		
		add (oneLine);
		add (twoLine);
		add (threeLine);
		add (fourLine);
		add (fiveLine);
		add (sixLine);
		add (sevenLine);
		add (eightLine);
		add (nineLine);
	}
	
	/**
	* Clears the list of name surfer entries stored inside this class.
	*/
	public void clear() {
		//	 You fill this in //
	}
	
	/* Method: addEntry(entry) */
	/**
	* Adds a new NameSurferEntry to the list of entries on the display.
	* Note that this method does not actually draw the graph, but
	* simply stores the entry; the graph is drawn by calling update.
	*/
	public void addEntry(NameSurferEntry entry) {
		// You fill this in //
	}
	
	
	
	/**
	* Updates the display image by deleting all the graphical objects
	* from the canvas and then reassembling the display according to
	* the list of entries. Your application must call update after
	* calling either clear or addEntry; update is also called whenever
	* the size of the canvas changes.
	*/
	public void update() {

	}
	
	
	
	
	/* Implementation of the ComponentListener interface */
	public void componentHidden(ComponentEvent e) { }
	public void componentMoved(ComponentEvent e) { }
	public void componentResized(ComponentEvent e) { update(); }
	public void componentShown(ComponentEvent e) { }
}
