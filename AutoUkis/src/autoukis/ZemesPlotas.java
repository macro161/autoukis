/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autoukis;

import java.awt.Color;
import java.awt.Point;

/**
 *
 * @author Justas
 */
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
    /**
     * @return the spalva
     */
    
    public Color getSpalva() {
        return spalva;
    }

    /**
     * @param spalva the spalva to set
     */
    public void setSpalva(Color spalva) {
        this.spalva = spalva;
    }

    /**
     * @return the p1
     */
    public Point getP1() {
        return p1;
    }

    /**
     * @param p1 the p1 to set
     */
    public void setP1(Point p1) {
        this.p1 = p1;
    }

    /**
     * @return the p2
     */
    public Point getP2() {
        return p2;
    }

    /**
     * @param p2 the p2 to set
     */
    public void setP2(Point p2) {
        this.p2 = p2;
    }

    /**
     * @return the msg
     */
    public String getMsg() {
        return msg;
    }

    /**
     * @param msg the msg to set
     */
    public void setMsg(String msg) {
        this.msg = msg;
    }

}
