/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autoukis;

import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author Justas
 */
public class UkioTechnika {

    static int kombainai = 0;
    static int sunkvezimiai = 0;
    static int plotis = 0;
    static double greitis = 0; // 1 cm apie 40 pixeliu, tarkim kombainas važiuoja 5km/h = 1.38m/s = 138cm/s = (3.45px/s) divided by mastelis

    public static void judejimoGreitis() {
        greitis = 3.45 / Map.mastelis;
    }

  public static void arimas() {
        Timer timer1 = new Timer();

        timer1.schedule(new TimerTask() {
            public void run() {
                int px = 100; // turėtų būt px = greitis
                plotis = 10;
                int i, j, k;
                int kiek = 0;
                for (i = 0; i < 1000; i++) {
                    for (j = 100; j < 900; j++) {
                        kiek = 0;
                        if (Map.pixels[i][j] == 3) {
                            for (k = 0; k < plotis; k++) {
                                if (Map.pixels[i + k][j] == 3) {
                                    kiek++;

                                    Map.pixels[i + k][j] = 4;
                                } else {
                                    break;
                                }

                            }

                        }
                        px -= kiek;
                        if (px <= 0) {
                            break;
                        }

                    }
                    if (px <= 0) {
                        break;
                    }
                    i += kiek;
                }
            }
        }, 0, 2000);
    }
}
