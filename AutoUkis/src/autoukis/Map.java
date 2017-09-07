/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autoukis;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Justas
 */
public class Map extends JPanel {
    
    int k = 1;
    static ArrayList listX = new ArrayList<Integer>();
    static ArrayList listY = new ArrayList<Integer>();
    static Point[] taskai = new Point[3];       
    int j = 50;
    int p;
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        setSize(800, 650);
   BufferedImage img = null;
try {
    img = ImageIO.read(new File("Untitled.png"));
} catch (IOException e) {
    System.out.println("nera");
}
        g.drawImage(img, 0, 70, null);
        setAlignmentY(BOTTOM_ALIGNMENT);
        setBackground(Color.WHITE);
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(0, 0, 800, 70);
        g.setColor(Color.BLUE);
       /* for (k = 0; k < list.size(); k++) {
            int[] p = (int[]) list.get(k);
            if (p[0] == 0)
                g.setColor(Color.ORANGE);
            if (p[0] == 1)
                g.setColor(Color.BLACK);
            if (p[0] == 2)
                g.setColor(Color.GREEN);
            if (p[0] == 3)
                g.setColor(Color.MAGENTA);
             g.fillRect(p[1], p[2], p[3], p[4]);
        } */
       g.setColor(Color.BLACK);
       for (j = 0; j < listX.size(); j++) {
           int x1 = (int) listX.get(j);
           int x2 = (int) listX.get(j+1);
           int y1 = (int) listY.get(j);
           int y2 = (int) listY.get(j+1);
       g.drawLine(x1, y1, x2, y1);
       g.drawLine(x1, y1, x1, y2);
       g.drawLine(x2, y2, x1, y2);
       g.drawLine(x2, y2, x2, y1);
       j++;
       }
       if (taskai[0] != null && taskai[1] != null) {
       g.drawLine(taskai[0].x, taskai[0].y, taskai[1].x, taskai[0].y);
       g.drawLine(taskai[0].x, taskai[0].y, taskai[0].x, taskai[1].y);
       g.drawLine(taskai[1].x, taskai[1].y, taskai[0].x, taskai[1].y);
       g.drawLine(taskai[1].x, taskai[1].y, taskai[1].x, taskai[0].y);
       }
    }
       

    public static double plotas(double lat1, double lon1, double lat2, double lon2) {
        double p = 0.017453292519943295;    // Math.PI / 180
        double a = 0.5 - Math.cos((lat2 - lat1) * p) / 2
                + Math.cos(lat1 * p) * Math.cos(lat2 * p)
                * (1 - Math.cos((lon2 - lon1) * p)) / 2;

        return (12742 * Math.asin(Math.sqrt(a))) * (12742 * Math.asin(Math.sqrt(a))) / 2; // 2 * R; R = 6371 km
    }
    public static void  updateList() {
        
            listX.add(taskai[0].x);
            listY.add(taskai[0].y);
            listX.add(taskai[1].x);
            listY.add(taskai[1].y);
    }

}
