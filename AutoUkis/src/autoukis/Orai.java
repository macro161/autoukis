package autoukis;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class Orai {

    String weatherToday(int city)
    {
        if(city == 0)
        {
            return "Nepasirinktas miestas";
        }
        String url = "https://www.gismeteo.lt/city/daily/" + city;
        Document document = null;
        try {
            document = Jsoup.connect(url).get();
        } catch (IOException ex) {
            Logger.getLogger(AutoUkis.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String miestas = document.select("#weather .scity").text();
        
        String temp = document.select("#weather .value.m_temp.c").text();
        temp = temp.substring(0, 5);
        String slegis = document.select("#weather .wicon.barp").text();
        slegis = slegis.substring(0, 8);
        String vejas = document.select("#weather .wicon.wind").text();
        vejas = vejas.substring(0, 4);
        
        return (miestas + "\nTemperatūra: " + temp + "\nSlėgis: " + slegis + "\nVėjo greitis: " + vejas);  
    }
    
    String weatherTomorrow(int city)
    {
        if(city == 0)
        {
            return "Nepasirinktas miestas";
        }
        String url = "https://www.gismeteo.lt/city/daily/" + city;
        Document document = null;
        try {
            document = Jsoup.connect(url).get();
        } catch (IOException ex) {
            Logger.getLogger(AutoUkis.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String miestas = document.select("#weather .scity").text();

        String temp = document.select("#weather-daily .value.m_temp.c").text();
        temp = temp.substring(5, 8) + "°C";
        String slegis = document.select("#weather-daily .value.m_press.torr").text();
        slegis = slegis.substring(0, 3) + "mm Hg";
        String vejas = document.select("#weather-daily .value.m_wind.ms").text();
        vejas = vejas.substring(0, 2) + "m/s";
        
        return (miestas + "\nTemperatūra: " + temp + "\nSlėgis: " + slegis + "\nVėjo greitis: " + vejas);
    }
}
