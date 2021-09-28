package org.getset;

import java.io.File;

import org.ascending.Files;
public class FilesService {
private static Files fileDirectory = new Files();
    
    public static void PrintFiles() {
    	
    	fileDirectory.fillFiles();

        for (File file : FilesService.getFileDirectory().getFiles())
        {
            System.out.println(file.getName());
        }
    }
    public static Files getFileDirectory() {
        return fileDirectory;
    }

    public static void setFileDirectory(Files fileDirectory) {
        FilesService.fileDirectory = fileDirectory;
    }


}
