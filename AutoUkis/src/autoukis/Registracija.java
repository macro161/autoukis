/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autoukis;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;

/**
 *
 * @author Justas
 */
public class Registracija implements Serializable{
   public void registruotis(String name, String pass) throws IOException, FileNotFoundException {

     BufferedWriter writer = new BufferedWriter(new FileWriter(
                "prisijungimai.txt", true)); 
        try { 
            String line = (System.lineSeparator() + name + " " + Integer.toString((name+pass).hashCode()));
            writer.write(line);
            writer.flush();


        }
         finally {
            writer.close();
        }

   }
   public boolean checkVardas(String name) throws FileNotFoundException, IOException {
       boolean uzimta = false;
       BufferedReader br = new BufferedReader(new FileReader("prisijungimai.txt")); 
        try {
            
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            if (line == null)
                return false;
         String[] splitLine;
            while (null != line) {
                splitLine = line.split(" ");
                if (splitLine[0].equals(name))
                    uzimta = true;
                line = br.readLine();
                
            }


        }
         finally {
            br.close();
        }
       
       return uzimta;
   }
}
