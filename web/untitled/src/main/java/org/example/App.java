package org.example;

import java.io.*;
import java.util.*;

public class App 
{
    public static void main( String[] args ) {

        Scanner scanner = new Scanner(System.in);
        Scanner fileIn; //Input file connection
        PrintWriter fileOut; //HTML file connection
        String fileNameIn; //original file name
        String fileNameOut; //new HTML file name
        int dotIndex; //hold the position of . in filename
        String line = null; // a line from the input file

        System.out.println("Enter file name or path");
        fileNameIn = scanner.nextLine();

        try{
            fileIn= new Scanner(new FileReader(fileNameIn));
            dotIndex= fileNameIn.lastIndexOf(".");
            if (dotIndex== -1){
                fileNameOut= fileNameIn+".html";
            }
            else {
                fileNameOut= fileNameIn.substring(0,dotIndex)+".html";
            }
            fileOut= new PrintWriter(fileNameOut);
            try{
                line= fileIn.nextLine();
            }
            catch(NoSuchElementException e){
                System.out.println("Error"+e.getMessage());
                if (line== null){
                    System.out.println("This file is empty");
                }
                else{
                    fileOut.println("<html>");
                    fileOut.println("<head>");
                    fileOut.println("</head>");
                    fileOut.println("<body>");
                    fileOut.println(line);
                    while(fileIn.hasNextLine()){
                        fileOut.println("<br>");
                        line=fileIn.nextLine();

                        if(line.isEmpty()){
                            fileOut.println("<br>");
                        }
                        else {
                            fileOut.println(line);
                        }

                    }
                    fileOut.println("<body>");
                    fileOut.println("</html>");

                    System.out.println("Html file is processed");
                }
                fileIn.close();
                fileOut.close();
            }
        }
        catch(FileNotFoundException e){
            System.out.println("File not found");

        }
    }
}
