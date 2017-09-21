package autoukis;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Prisijungimas {

    public Prisijungimas() {

    }

    public boolean prisijungti(String hashcode) throws IOException, FileNotFoundException {

      BufferedReader br = new BufferedReader(new FileReader("prisijungimai.txt"));  
        boolean rado = false;
        try {
            
            StringBuilder sb = new StringBuilder();
            String hashFromFile = br.readLine();

            int count = 1;
            while (hashFromFile != null) {
     
                if (hashcode.equals(hashFromFile)) {

                    rado = true;
                }
                hashFromFile = br.readLine();
            }


        }
         finally {
            br.close();
        }

        return rado;
    }

}
