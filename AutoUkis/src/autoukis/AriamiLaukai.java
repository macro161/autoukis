package autoukis;

import java.awt.Color;
import java.awt.Point;

public class AriamiLaukai extends ZemesPlotas {
    private ZemesParametrai parametrai; 
    public AriamiLaukai(Color spalva, Point p1, Point p2, String msg, ZemesParametrai parametrai) {
        super(spalva, p1, p2, msg);
        this.parametrai = parametrai;
    }

    public void kultivuoti() {

    }
    public ZemesParametrai getParametrai() {
        return parametrai;
    }

}
