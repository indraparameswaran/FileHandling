package com.hcl.filehandling;

import java.io.File;
import java.io.IOException;

import com.hcl.util.Constants;

public class CreateFile {
	
	//public static final String peopleRecordsPath = "src\\main\\resources\\testFile01.txt";
	
	public static void createFileUsingFileClass() throws IOException {
//		
		File file = new File(Constants.peopleRecordsPath);
		
		//Create the file
		
		try {
		
		if (file.createNewFile()) {
			System.out.println("File is created");
		} else {
			System.out.println("File already exists");
		}
	} catch(IOException e) {
		e.printStackTrace();
	}
		
	}


}
