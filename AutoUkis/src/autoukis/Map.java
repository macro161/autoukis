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
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Map extends JPanel {

    private ZemesTeritorija plotas;
    private List<ZemesTeritorija> plotai = new ArrayList<>();
    private int sleptiNustatymus = 0;
    private int mastelis = 0;

    @Override
    public void paintComponent(Graphics g) {

        if (plotas != null) {
            if (!(check(plotas.getP1()) && check(plotas.getP2()))) {
                return;
            }
        }
        super.paintComponent(g);
        setSize(800, 650);
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File("Untitled.png"));
        } catch (IOException e) {
            System.out.println("nera");
        }
        g.drawImage(img, 0, 70, null);
        setBackground(Color.WHITE);
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(0, 0, 800, 70);
        if (getSleptiNustatymus() == 0) {
            g.fillRect(0, 500, 550, 150);
            g.setColor(Color.BLUE);
            g.drawRect(4, 567, 10, 10);
            g.setColor(Color.GREEN);
            g.drawRect(4, 606, 10, 10);
            g.setColor(Color.MAGENTA);
            g.drawRect(4, 512, 10, 10);
        }
        g.setColor(Color.BLACK);
        if (getPlotai() != null) {
            for (ZemesTeritorija temp : getPlotai()) {
                g.setColor(temp.getSpalva());
                g.drawLine(temp.getP1().x, temp.getP1().y, temp.getP2().x, temp.getP1().y);
                g.drawLine(temp.getP1().x, temp.getP1().y, temp.getP1().x, temp.getP2().y);
                g.drawLine(temp.getP2().x, temp.getP2().y, temp.getP1().x, temp.getP2().y);
                g.drawLine(temp.getP2().x, temp.getP2().y, temp.getP2().x, temp.getP1().y);
            }
        }
        if (getPlotas() != null) {
            g.setColor(getPlotas().getSpalva());
            g.drawLine(getPlotas().getP1().x, getPlotas().getP1().y, getPlotas().getP2().x, getPlotas().getP1().y);
            g.drawLine(getPlotas().getP1().x, getPlotas().getP1().y, getPlotas().getP1().x, getPlotas().getP2().y);
            g.drawLine(getPlotas().getP2().x, getPlotas().getP2().y, getPlotas().getP1().x, getPlotas().getP2().y);
            g.drawLine(getPlotas().getP2().x, getPlotas().getP2().y, getPlotas().getP2().x, getPlotas().getP1().y);
        }
    }

    public void updateList(ZemesTeritorija plotas) {
        if (check(plotas.getP1()) && check(plotas.getP2())) {
            if ((Math.abs(plotas.getP1().x - plotas.getP2().x) > 5) && (Math.abs(plotas.getP1().y - plotas.getP2().y) > 5)) {
                getPlotai().add(plotas);
            }
        }

    }

    public boolean check(Point p) {
        boolean okay = true;
        for (ZemesTeritorija temp : plotai) {
            if ((((p.x > temp.getP1().x) && (p.x < temp.getP2().x)) || ((p.x < temp.getP1().x) && (p.x > temp.getP2().x))) && (((p.y > temp.getP1().y) && (p.y < temp.getP2().y)) || ((p.y < temp.getP1().y) && (p.y > temp.getP2().y)))) {
                okay = false;
                this.plotas = temp;
            }
        }
        return okay;
    }

    /**
     * @return the plotas
     */
    public ZemesTeritorija getPlotas() {
        return plotas;
    }

    /**
     * @param plotas the plotas to set
     */
    public void setPlotas(ZemesTeritorija plotas) {
        this.plotas = plotas;
    }

    /**
     * @return the plotai
     */
    public List<ZemesTeritorija> getPlotai() {
        return plotai;
    }

    /**
     * @return the sleptiNustatymus
     */
    public int getSleptiNustatymus() {
        return sleptiNustatymus;
    }

    /**
     * @param sleptiNustatymus the sleptiNustatymus to set
     */
    public void setSleptiNustatymus(int sleptiNustatymus) {
        this.sleptiNustatymus = sleptiNustatymus;
    }

    /**
     * @return the mastelis
     */
    public int getMastelis() {
        return mastelis;
    }

    /**
     * @param mastelis the mastelis to set
     */
    public void setMastelis(int mastelis) {
        this.mastelis = mastelis;
    }

}
