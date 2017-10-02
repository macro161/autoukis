package autoukis;

import java.awt.Color;
import java.awt.Point;
import java.io.Serializable;

public class UkinisPastatas extends ZemesTeritorija implements Serializable{

    private Gyvunas gyvunas;
    private UkioTechnika technika;

    public UkinisPastatas(Color spalva, Point p1, Point p2, String msg, int mastelis) {
        super(spalva, p1, p2, msg, mastelis);

    }

}