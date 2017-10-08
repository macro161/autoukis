package autoukis;

import java.io.Serializable;
import java.util.Random;

public class ZemesDetektorius implements Serializable{

    Random rnd = new Random();
    
    private float dregme;
    private float ph;
    private float smelis;
    private float varis;
    private float cinkas;
    
    
    
    public ZemesDetektorius() {
        
        
        
    }

  

    public float getDregme() {
        dregme = 5 + rnd.nextFloat()*(30-5);
        return dregme;
    }

    public float getPh() {
        ph = 6 + rnd.nextFloat()*(10-6);
        return ph;
    }

    public float getSmelis() {
        smelis = 50 + rnd.nextFloat()*(60-50);
        return smelis;
    }

    public float getVaris() {
        varis = 14 + rnd.nextFloat()*(18-14);
        return varis;
    }

    public float getCinkas() {
        cinkas = 35 + rnd.nextFloat()*(45-35);
        return cinkas;
    }

    
}
