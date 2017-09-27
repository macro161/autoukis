/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autoukis;

import java.io.Serializable;


public class Naudotojas implements Serializable{
     private String name;
     private String hashCode;
     private String pasiekiamumas;
     public Naudotojas (String name, String hashCode, String pasiekiamumas) {
         this.name = name;
         this.hashCode = hashCode;
         this.pasiekiamumas = pasiekiamumas;
     }
     public boolean changePass(String name, String pass1, String pass2) {
        return true; 
     }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the hashCode
     */
    public String getHashCode() {
        return hashCode;
    }

    /**
     * @return the pasiekiamumas
     */
    public String getPasiekiamumas() {
        return pasiekiamumas;
    }
    
}
