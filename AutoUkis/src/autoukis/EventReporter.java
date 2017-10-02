/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autoukis;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;


/**
 *
 * @author Justas
 */
public class EventReporter {
    
    String fileName;
    public EventReporter (String fileName) {
        this.fileName = fileName;
    }
    public void reportEvent(String message) {
        try {
            File events = new File(fileName);
             PrintWriter out = new PrintWriter(new FileWriter(events, true));
             out.write((new Date() {}).toString()+ " : " + message + System.getProperty("line.separator"));
             out.close();
        }
        catch(IOException e){
            System.out.println("error");
            
        }
    }
}
