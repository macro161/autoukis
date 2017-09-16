package autoukis;

public class ZemesParametrai {

    private String plotoPavadinimas;
    private int sluoksnis;
    private int storis;
    private int smelisProcentais;
    private int dregme;
    private int ph;

    private Map map;
    private Orai orai = new Orai(); //Busimas obnjektas kuri naudosim nustatyti zemes dregmei

    public ZemesParametrai(Map map, String plotoPavadinimas, int sluoksnis, int storis, int smelisProcentais, int dregme, int ph) {
        this.plotoPavadinimas = plotoPavadinimas;
        this.sluoksnis = sluoksnis;
        this.storis = storis;
        this.smelisProcentais = smelisProcentais;
        this.dregme = dregme;
        this.ph = ph;
        this.map = map;
    }

    public void kadaIsdziusZeme() {

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

    public int getSmelisProcentais() {
        return smelisProcentais;
    }

    public int getDregme() {
        return dregme;
    }

    public int getPh() {
        return ph;
    }

    public Map getMap() {
        return map;
    }

    public Object getOrai() {
        return orai;
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
