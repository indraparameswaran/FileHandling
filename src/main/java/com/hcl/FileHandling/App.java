package com.hcl.FileHandling;

import java.io.IOException;

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
        
        
    }
    
    
}
