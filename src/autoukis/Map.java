/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autoukis;

import java.awt.Color;
import static java.awt.Component.BOTTOM_ALIGNMENT;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import static java.lang.Math.abs;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 *
 * @author Justas
 */
public class Map extends JPanel {

    int k = 1;
    static int[][] pixels = new int[10000][10000];
    static ArrayList listX = new ArrayList<Integer>();
    static ArrayList listY = new ArrayList<Integer>();
    static ArrayList listSpalva = new ArrayList<Integer>();
    static Point[] taskai = new Point[3];
    static int spalva = 5;
    static int sleptiNustatymus = 0;
    static int mastelis = 0;
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
        if (sleptiNustatymus == 0) {
            g.fillRect(0, 500, 550, 150);
            g.setColor(Color.BLUE);
            g.drawRect(4, 567, 10, 10);
            g.setColor(Color.GREEN);
            g.drawRect(4, 606, 10, 10);
            g.setColor(Color.MAGENTA);
            g.drawRect(4, 512, 10, 10);
        }

        g.setColor(Color.BLACK);
        if (spalva == 5) {
            return;
        }
        for (j = 0; j < listX.size(); j++) {
            int x1 = (int) listX.get(j);
            int x2 = (int) listX.get(j + 1);
            int y1 = (int) listY.get(j);
            int y2 = (int) listY.get(j + 1);
            int spalva = (int) listSpalva.get(j);
            if (spalva == 1) {
                g.setColor(Color.BLUE);
            }
            if (spalva == 2) {
                g.setColor(Color.GREEN);
            }
            if (spalva == 3) {
                g.setColor(Color.MAGENTA);
            }
            g.drawLine(x1, y1, x2, y1);
            g.drawLine(x1, y1, x1, y2);
            g.drawLine(x2, y2, x1, y2);
            g.drawLine(x2, y2, x2, y1);
            j++;
        }

        if (taskai[0] != null && taskai[1] != null) {
            int i;
            g.setColor(Color.CYAN);
            for (j = 0; j < 1000; j++) {
                for (i = 100; i < 900; i++) {
                    if (pixels[i][j] == 4) {
                        g.fillRect(i, j, 1, 1);
                        i += 3;
                    }
                }
            }
            if (pixels[taskai[0].x][taskai[0].y] != 0) {
                return;
            }
            if (pixels[taskai[1].x][taskai[1].y] != 0) {
                return;
            }
            if (spalva == 1) {
                g.setColor(Color.BLUE);
            }
            if (spalva == 2) {
                g.setColor(Color.GREEN);
            }
            if (spalva == 3) {
                g.setColor(Color.MAGENTA);
            }
            g.drawLine(taskai[0].x, taskai[0].y, taskai[1].x, taskai[0].y);
            g.drawLine(taskai[0].x, taskai[0].y, taskai[0].x, taskai[1].y);
            g.drawLine(taskai[1].x, taskai[1].y, taskai[0].x, taskai[1].y);
            g.drawLine(taskai[1].x, taskai[1].y, taskai[1].x, taskai[0].y);
        }

    }


    public static void updateList() {
        int i, j;
        int x1 = taskai[0].x;
        int x2 = taskai[1].x;
        int y1 = taskai[0].y;
        int y2 = taskai[1].y;
        if ((abs(taskai[0].x - taskai[1].x)) < 10) {
            return;
        }
        if ((abs(taskai[0].y - taskai[1].y)) < 10) {
            return;
        }
        if (x1 > x2) {
            i = x1;
            x1 = x2;
            x2 = i;
        }
        if (y1 > y2) {
            i = y1;
            y1 = y2;
            y2 = i;
        }
        for (i = x1; i < x2; i++) {
            for (j = y1; j < y2; j++) {
                if (pixels[i][j] != 0) {
                    return;
                }
            }
        }
        listX.add(taskai[0].x);
        listY.add(taskai[0].y);
        listX.add(taskai[1].x);
        listY.add(taskai[1].y);
        listSpalva.add(spalva);
        listSpalva.add(spalva);

        for (i = x1; i < x2; i++) {
            for (j = y1; j < y2; j++) {
                pixels[i][j] = spalva;
            }
        }

    }

}
