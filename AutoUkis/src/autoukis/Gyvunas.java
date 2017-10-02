package autoukis;

import java.io.Serializable;

public class Gyvunas implements Serializable{

    private String veisle;
    private int id;
    private int amzius;
    private String lytis;
    private float suvartojamasMaistas;
    private String gps;

    public Gyvunas() {

    }

    public Gyvunas(int id, String veisle, int amzius, String lytis, float suvartojamasMaistas, String gps) {
        this.veisle = veisle;
        this.id = id;
        this.amzius = amzius;
        this.lytis = lytis;
        this.suvartojamasMaistas = suvartojamasMaistas;
        this.gps = gps;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAmzius(int amzius) {
        this.amzius = amzius;
    }

    public void setSuvartojamasMaistas(float suvartojamasMaistas) {
        this.suvartojamasMaistas = suvartojamasMaistas;
    }

    public void setGps(String gps) {
        this.gps = gps;
    }

    public String getGps() {
        return gps;
    }

    public String getVeisle() {
        return veisle;
    }

    public int getId() {
        return id;
    }

    public int getAmzius() {
        return amzius;
    }

    public String getLytis() {
        return lytis;
    }

    public float getSuvartojamasMaistas() {
        return suvartojamasMaistas;
    }

}
