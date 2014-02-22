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
    /*public Nanto(int str, int m, int c, int b, int e, int en, int me){
        strength = str;
		money = m;
		charm = c;
		brain = b;
		energy = e;
		enlightment = en;
                maxEnergy = me;
    }*/
    
    public Nanto(){
        strength = 0;
		money = 0;
		charm = 0;
		brain = 0;
		energy = 0;
		enlightment = 0;
                maxEnergy = 0;
                inventory = new ArrayList<>();
                
                
    }
    
    
    //METHOD
    public void recovery(){
        //METHOD UNTUK MERECOVER ENERGY
        energy = maxEnergy;
    }
    
    public boolean cekBarang(String k) {
        for (int i = 0; i< inventory.size(); i++) {
            if (inventory.get(i).kodeBarang.equals(k)) {
               if (inventory.get(i).stock > 0) 
                   return true;
                    
            }
                
        }
        return false;
    }
    
    public void addBarang(String k) {
        for (int i = 0; i< inventory.size(); i++) {
            if (inventory.get(i).kodeBarang.equals(k)) {
               inventory.get(i).stock++;
               break;
                   
                    
            }
                
        }
    }
    
     public void removeBarang(String k) {
         for (int i = 0; i< inventory.size(); i++) {
            if (inventory.get(i).kodeBarang.equals(k)) {
               inventory.get(i).stock--;
               break;
                   
                    
            }
                
        }
    }
     
    public void printStatusNanto()
    {
        System.out.println("Strengh = " + strength);
        System.out.println("Money = " + money);
        System.out.println("Charm = " + charm);
        System.out.println("Brain = " + brain);
        System.out.println("Energy = " + energy);
        System.out.println("Enlightment = " + enlightment);
        System.out.println("maxEnergy = " + maxEnergy);
        System.out.println(" ");
    }
    
    
    
}
