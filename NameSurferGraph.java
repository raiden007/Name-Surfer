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
		createBackgroundLines();
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
//		removeAll();
		createBackgroundLines();
		createBackgroundLabels();
	}
	
	
	private void createBackgroundLabels() {
		GLabel one = new GLabel ("1900",0 , APPLICATION_HEIGHT - GRAPH_MARGIN_SIZE);
		GLabel two = new GLabel ("1910",APPLICATION_WIDTH / 10 , APPLICATION_HEIGHT - GRAPH_MARGIN_SIZE);
		GLabel three = new GLabel ("1920",2*(APPLICATION_WIDTH / 10) , APPLICATION_HEIGHT - GRAPH_MARGIN_SIZE);
		GLabel four = new GLabel ("1930",3*(APPLICATION_WIDTH / 10) , APPLICATION_HEIGHT - GRAPH_MARGIN_SIZE);
		GLabel five = new GLabel ("1940",4*(APPLICATION_WIDTH / 10) , APPLICATION_HEIGHT - GRAPH_MARGIN_SIZE);
		GLabel six = new GLabel ("1950",5*(APPLICATION_WIDTH / 10) , APPLICATION_HEIGHT - GRAPH_MARGIN_SIZE);
		GLabel seven = new GLabel ("1960",6*(APPLICATION_WIDTH / 10) , APPLICATION_HEIGHT - GRAPH_MARGIN_SIZE);
		GLabel eight = new GLabel ("1970",7*(APPLICATION_WIDTH / 10) , APPLICATION_HEIGHT - GRAPH_MARGIN_SIZE);
		GLabel nine = new GLabel ("1980",8*(APPLICATION_WIDTH / 10) , APPLICATION_HEIGHT - GRAPH_MARGIN_SIZE);
		GLabel ten = new GLabel ("1990",9*(APPLICATION_WIDTH / 10) , APPLICATION_HEIGHT - GRAPH_MARGIN_SIZE);
		GLabel eleven = new GLabel ("2000",APPLICATION_WIDTH , APPLICATION_HEIGHT - GRAPH_MARGIN_SIZE);
		
		add (one);
		add (two);
		add (three);
		add (four);
		add (five);
		add (six);
		add (seven);
		add (eight);
		add (nine);
		add (ten);
		add (eleven);
		
	}

	private void createBackgroundLines() {
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
		
		int tenX = 8*(APPLICATION_WIDTH / 10);
		GLine tenLine = new GLine (tenX,0,tenX,APPLICATION_HEIGHT);
		
		int elevenX = 9*(APPLICATION_WIDTH / 10);
		GLine elevenLine = new GLine (elevenX,0,elevenX,APPLICATION_HEIGHT);
		
		int twelveX = APPLICATION_WIDTH;
		GLine twelveLine = new GLine (twelveX,0,twelveX,APPLICATION_HEIGHT);
		
		GLine upperLine = new GLine (0, GRAPH_MARGIN_SIZE, APPLICATION_WIDTH,GRAPH_MARGIN_SIZE );
		
		GLine lowerLine = new GLine (0, APPLICATION_HEIGHT - GRAPH_MARGIN_SIZE,APPLICATION_WIDTH ,APPLICATION_HEIGHT - GRAPH_MARGIN_SIZE );
		
		add (oneLine);
		add (twoLine);
		add (threeLine);
		add (fourLine);
		add (fiveLine);
		add (sixLine);
		add (sevenLine);
		add (eightLine);
		add (nineLine);
		add (tenLine);
		add (elevenLine);
		add (twelveLine);
		add (upperLine);
		add (lowerLine);
		
	}

	/* Implementation of the ComponentListener interface */
	public void componentHidden(ComponentEvent e) { }
	public void componentMoved(ComponentEvent e) { }
	public void componentResized(ComponentEvent e) { update(); }
	public void componentShown(ComponentEvent e) { }
}
