package com.hcl.filehandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import com.hcl.util.Constants;

public class AppendFile {

	public static void appendFileUsingBufferedWriter() throws IOException {

		try {
			String data = "\nAdding this line to the file\n";
			File file = new File(Constants.peopleRecordsPath);

			FileWriter fileWriter = new FileWriter(file, true);
			BufferedWriter bw = new BufferedWriter(fileWriter);
			try {
				bw.write(data);
			} finally {
				bw.close();
				System.out.println("Done appending to the file");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
