package autoukis;

import java.awt.Color;
import java.awt.Point;
import java.io.Serializable;

public class ZemesTeritorija implements Serializable {

    private Color spalva;
    private Point p1;
    private Point p2;
    private String msg;
    private final double plotas;

    public ZemesTeritorija(Color spalva, Point p1, Point p2, String msg, int mastelis) {
        this.spalva = spalva;
        this.p1 = p1;
        this.p2 = p2;
        this.msg = msg;
        this.plotas = apskaiciuotiPlota(mastelis);
    }

    public Color getSpalva() {
        return spalva;
    }

    public void setSpalva(Color spalva) {
        this.spalva = spalva;
    }

    public Point getP1() {
        return p1;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public Point getP2() {
        return p2;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
    public double getPlotas() {
        return plotas;
    }
    private double apskaiciuotiPlota(int mastelis) {

        return (double)(((Math.abs(p1.x - p2.x) * Math.abs(p1.y - p2.y))*(((double)(0.2*0.14*mastelis*mastelis))))/10000);
    }

}