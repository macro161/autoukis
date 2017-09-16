package autoukis;

import java.awt.Color;
import java.awt.Point;

public class ZemesPlotas {

    private Color spalva;
    private Point p1;
    private Point p2;
    private String msg;

    public ZemesPlotas(Color spalva, Point p1, Point p2, String msg) {
        this.spalva = spalva;
        this.p1 = p1;
        this.p2 = p2;
        this.msg = msg;
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

}
