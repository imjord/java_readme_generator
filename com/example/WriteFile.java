package com.example;
import java.io.FileWriter;
import java.io.IOException;


public class WriteFile {

    
    public static void writeFile(String data) {
        try {
            FileWriter writeToFile = new FileWriter("readme.md");
            writeToFile.write(data);
            writeToFile.close(); 
            System.out.println("Succesfully wrote data to readme");
        } catch (IOException e){
            System.out.println("An error occured");
            e.printStackTrace();
        }
    }

}
