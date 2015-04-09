import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

/*
 * File: NameSurferDataBase.java
 * -----------------------------
 * This class keeps track of the complete database of names.
 * The constructor reads in the database from a file, and
 * the only public method makes it possible to look up a
 * name and get back the corresponding NameSurferEntry.
 * Names are matched independent of case, so that "Eric"
 * and "ERIC" are the same names.
 */

public class NameSurferDataBase implements NameSurferConstants {
	
/* Constructor: NameSurferDataBase(filename) */
/**
 * Creates a new NameSurferDataBase and initializes it using the
 * data in the specified file.  The constructor throws an error
 * exception if the requested file does not exist or if an error
 * occurs as the file is being read.
 */
	public NameSurferDataBase(String filename) {
		   database = new ArrayList<String>();
		   try {
			   BufferedReader reader = new BufferedReader(new FileReader(filename));
			   String line;
			    while ((line = reader.readLine()) != null) {
			    	database.add(line);
			    }
			    reader.close();
		   }
		   catch (Exception e)
		   {
		     System.err.format("Exception occurred trying to read '%s'.", "names-data.txt");
		     e.printStackTrace();
		   }
	   }
	
/* Method: findEntry(name) */
/**
 * Returns the NameSurferEntry associated with this name, if one
 * exists.  If the name does not appear in the database, this
 * method returns null.
 */
	public NameSurferEntry findEntry(String name) {
		// You need to turn this stub into a real implementation //
		if (database.contains(name)) {
			return null;
		} else {
		return null;
		}
	}
	
	private ArrayList<String> database;
}

