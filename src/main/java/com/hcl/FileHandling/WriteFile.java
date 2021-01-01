package com.hcl.filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import com.hcl.util.Constants;

public class WriteFile {
	
	public static void writeFileUsingFileWriter() throws IOException {
		File file = new File(Constants.peopleRecordsPath);
		
	try {
		FileWriter writer = new FileWriter(file);
		writer.write("Writing the first line to the file\n");
		writer.write("Writing the second line to the file\n");
		writer.close();		
	} catch(IOException e){
		e.printStackTrace();
	}
	
}
	
}
	
