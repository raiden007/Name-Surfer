/*
 * File: NameSurferEntry.java
 * --------------------------
 * This class represents a single entry in the database.  Each
 * NameSurferEntry contains a name and a list giving the popularity
 * of that name for each decade stretching back to 1900.
 */

import acm.util.*;
import java.util.*;

public class NameSurferEntry implements NameSurferConstants {

/* Constructor: NameSurferEntry(line) */
/**
 * Creates a new NameSurferEntry from a data line as it appears
 * in the data file.  Each line begins with the name, which is
 * followed by integers giving the rank of that name for each
 * decade.
 */
	public NameSurferEntry(String line) {
		parseLine(line);
	}

	private void parseLine(String line) {

		int nameEnd = line.indexOf(" ");
		name = line.substring(0, nameEnd);
	
		String numbers = line.substring(nameEnd + 1);
		String startParsing = numbers;
//		println("startParsing:" + startParsing);
		for (int i=0; i<NDECADES; i++) {
			int endDecade = startParsing.indexOf(" ");
//			println("endDecade:"+endDecade);
			if (endDecade == -1) {
				decade = startParsing.substring(0);
//				println("decade:" + decade);
			} else {
				decade = startParsing.substring(0, endDecade);
//				println("decade:" + decade);
			}

			int decadeInt = Integer.parseInt(decade);
//			println("decadeInt" + decadeInt);
			rankings[i] = decadeInt;
//			println(rankings[i]);
			startParsing = startParsing.substring(endDecade + 1);
//			println("new start parsing:" + startParsing);
		}
	}

/* Method: getName() */
/**
 * Returns the name associated with this entry.
 */
	public String getName() {
		return name;
	}

/* Method: getRank(decade) */
/**
 * Returns the rank associated with an entry for a particular
 * decade.  The decade value is an integer indicating how many
 * decades have passed since the first year in the database,
 * which is given by the constant START_DECADE.  If a name does
 * not appear in a decade, the rank value is 0.
 */
	public int getRank(int decade) {
		// You need to turn this stub into a real implementation //
		return rankings[decade];
	}

/* Method: toString() */
/**
 * Returns a string that makes it easy to see the value of a
 * NameSurferEntry.
 */
	public String toString() {
		toString = name + " [";
		for (int i=0; i<NDECADES; i++) {
			toString += rankings[i] + " ";
		}
		toString += "]";
		return toString;
	}
	
	private String name;
	private int[] rankings = new int[NDECADES];
	private String decade;
	private String toString;
}

