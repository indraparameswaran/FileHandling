package com.hcl.FileHandling;

import java.io.File;
import java.io.IOException;

public class CreateFile {
	
	public static void createFileUsingFileClass() throws IOException {
		File file = new File("C:\\Users\\indrakumari.param\\eclipse-workspace\\FileHandling\\src\\main\\resources\\testFile01.txt");
		
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
