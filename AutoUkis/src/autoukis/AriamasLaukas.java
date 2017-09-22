package autoukis;

import java.awt.Color;
import java.awt.Point;

public class AriamasLaukas extends ZemesTeritorija {
    private ZemesParametrai parametrai; 
    public AriamasLaukas(Color spalva, Point p1, Point p2, String msg, ZemesParametrai parametrai) {
        super(spalva, p1, p2, msg);
        this.parametrai = parametrai;
    }

    public void kultivuoti() {

    }
    public ZemesParametrai getParametrai() {
        return parametrai;
    }

}
