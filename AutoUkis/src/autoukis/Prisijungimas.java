package autoukis;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Prisijungimas {

    public Prisijungimas() {

    }

    public boolean prisijungti(String name, String pass) throws IOException, FileNotFoundException {

      BufferedReader br = new BufferedReader(new FileReader("prisijungimai.txt"));  
        boolean rado = false;
        try {
            
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            String[] splitLine = line.split(" ");
            String hash = Integer.toString((name + pass).hashCode());
            String hashFromFile = splitLine[1];
            while (line != null) {
                splitLine = line.split(" ");
                hashFromFile = splitLine[1];
                if (hash.equals(hashFromFile)) {

                    rado = true;
                }
                line = br.readLine();
            }


        }
         finally {
            br.close();
        }

        return rado;
    }

}
