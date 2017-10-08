package autoukis;

import java.io.Serializable;
import java.util.List;

public class ZemesParametrai implements Serializable{
    private String plotoPavadinimas;
    private int sluoksnis;
    private int storis;
    private double smelisProcentais;
    private double dregme;
    private double ph;
    private ZemesDetektorius detektorius = new ZemesDetektorius();

    public ZemesParametrai(String plotoPavadinimas, int sluoksnis, int storis, int smelisProcentais, int dregme, int ph) {
        this.plotoPavadinimas = plotoPavadinimas;
        this.sluoksnis = 4;
        this.storis = 3;
        this.smelisProcentais = detektorius.getSmelis();
        this.dregme = detektorius.getDregme();
        this.ph = detektorius.getPh();
    }

    public void kadaIsdziusZeme() {

    }
    public void getParametrai(){
        //storis = detektorius.getStoris(); 
    }

    public String getPlotoPavadinimas() {
        return plotoPavadinimas;
    }

    public int getSluoksnis() {
        return sluoksnis;
    }

    public int getStoris() {
        return storis;
    }

    public double getSmelisProcentais() {
        return smelisProcentais;
    }

    public double getDregme() {
        return dregme;
    }

    public double getPh() {
        return ph;
    }


    public void setPlotoPavadinimas(String plotoPavadinimas) {
        this.plotoPavadinimas = plotoPavadinimas;
    }

    public void setSluoksnis(int sluoksnis) {
        this.sluoksnis = sluoksnis;
    }

    public void setStoris(int storis) {
        this.storis = storis;
    }

    public void setSmelisProcentais(int smelisProcentais) {
        this.smelisProcentais = smelisProcentais;
    }

    public void setDregme(int dregme) {
        this.dregme = dregme;
    }

    public void setPh(int ph) {
        this.ph = ph;
    }

}
