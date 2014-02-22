/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Basic;

import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class Nanto {
    
    //ATTRIBUTE
    public int strength;
    public int money;
    public int charm;
    public int brain;
    public int energy;
    public int maxEnergy;
    public ArrayList<Barang> inventory;
    
    public int enlightment;
    
    //CTOR
    public Nanto(int str, int m, int c, int b, int e, int en, int me){
        strength = str;
		money = m;
		charm = c;
		brain = b;
		energy = e;
		enlightment = en;
                maxEnergy = me;
    }
    
    
    
    //METHOD
    public void recovery(){
        //METHOD UNTUK MERECOVER ENERGY
        energy = maxEnergy;
    }
    
    
    
}
