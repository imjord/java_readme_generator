package com.example;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class CreateFile {
    public static void makeFile(){
        try {
            
            File file = new File("readme.md");
            if(file.createNewFile()){
                System.out.println("Read me created. " + file.getName());

            } else {
                System.out.println("File already exists");
            }
        } catch(IOException e) {
            System.out.println("an error occured");
            e.printStackTrace();
        }
       
    } 
    public static void readFile(ReadMeData data){
        try {   
           
            File readTemplateFile = new File("template.md");
            Scanner readTemplate = new Scanner(readTemplateFile);
            StringBuilder templateBuilder = new StringBuilder();
                while(readTemplate.hasNextLine()){
                    String output = readTemplate.nextLine();
                    templateBuilder.append(output).append("\n");
                
                }
                readTemplate.close();
               data.setTemplate(templateBuilder.toString());
        } catch(IOException e) {
            System.out.println("Error occured reading the template file");
            e.printStackTrace();
        }
    }
}

