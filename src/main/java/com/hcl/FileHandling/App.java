package com.hcl.filehandling;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import com.hcl.util.Constants;

/**
 * Hello world!
 *
 */
public class App 
{
	
	
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "step 1 : creating the file");
        CreateFile.createFileUsingFileClass();
        
        System.out.println( "step 2 : writing to the file");
        WriteFile.writeFileUsingFileWriter();
        
        System.out.println( "step 3 : reading from the file");
        readContentsFromFile();
        
        System.out.println( "step 4 : Appending to the file");
        AppendFile.appendFileUsingBufferedWriter();
        
        System.out.println( "step 5 : reading from the file after appending");
        readContentsFromFile();    
        
    }

	public static void readContentsFromFile() {
		List list = ReadFile.readFileUsingList(Constants.peopleRecordsPath);        
          
        Iterator<String> itr = list.iterator();
        while(itr.hasNext()) {
        	System.out.println(itr.next());       	
        }
	}
    
    
}
