package com.hcl.FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
	
	public static void writeFileUsingFileWriter() throws IOException {
		File file = new File("C:\\Users\\indrakumari.param\\eclipse-workspace\\FileHandling\\src\\main\\resources\\testFile01.txt");
		
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
	
