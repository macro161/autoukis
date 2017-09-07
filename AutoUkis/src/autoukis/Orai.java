package orai;
import java.util.Scanner;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Orai {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int city = sc.nextInt();
        String url = "https://www.gismeteo.lt/city/daily/" + city;
        Document document = Jsoup.connect(url).get();

        String temp = document.select("#weather .temp").text();
        System.out.println("Temperatura: " + temp);
    }
}