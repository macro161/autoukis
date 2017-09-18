package autoukis;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Prisijungimas {

    public Prisijungimas() {

    }

    public boolean prisijungti(String prisijungimoVardas, String slaptazodis) throws FileNotFoundException, IOException {

        BufferedReader br = new BufferedReader(new FileReader("prisijungimai.txt"));
        boolean rado = false;
        try {

            StringBuilder sb = new StringBuilder();
            String vardas = br.readLine();
            String pass = br.readLine();

            int count = 1;
            while (vardas != null && pass != null) {
                System.out.println(vardas + " " + prisijungimoVardas + "    " + prisijungimoVardas + " " + slaptazodis);
                if (prisijungimoVardas.equals(vardas)) {

                    rado = true;
                    System.out.println(rado);

                }
                vardas = br.readLine();
                pass = br.readLine();

            }

        } finally {

            br.close();
        }

        return rado;
    }

}
