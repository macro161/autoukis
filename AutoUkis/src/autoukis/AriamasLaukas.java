package autoukis;

import java.awt.Color;
import java.awt.Point;
import java.io.Serializable;

public class AriamasLaukas extends ZemesTeritorija implements Serializable{
    
    private ZemesParametrai parametrai; 
    private int apdirbtasPlotas = 0;
    public AriamasLaukas(Color spalva, Point p1, Point p2, String msg, int mastelis, ZemesParametrai parametrai) {
        super(spalva, p1, p2, msg, mastelis);
        this.parametrai = parametrai;
    }

    public void kultivuoti() {

    }
    public ZemesParametrai getParametrai() {
        return parametrai;
    }

}