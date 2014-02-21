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
    public Nanto(){
        
    }
    
    //METHOD
    public void recovery(){
        //METHOD UNTUK MERECOVER ENERGY
        energy = maxEnergy;
    }
    
    
    
}
