/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Basic;

import GUI.GUIMain;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class World {
    
    //ATTRIBUTE
    public Nanto player;
    public ArrayList<Candidate> candidates;
    public ArrayList<Tempat> tempats;
    public int hari;
    public int jam;
    public ArrayList<Barang> itemStore;
    public int maxMinggu;
    public GUIMain GUI;
    
    
    
    //contructor
    public World(){
    GUI = new GUIMain();
    
    
    }
    
    //METHOD
    public void restock(){
        
    }
    
    public void nextDay(){
			hari++;
    }
    
    public void nextHour(){
        if (jam == 21) {
			jam = 10;
			nextDay();
        }
		else
			jam++;
    }
    
    public boolean isFinished() {
        if (hari == (maxMinggu * 7))
            return true;
     return false;
    }


        public static void main(String[] args) {
            World w =new World();
            w.GUI.runIt();
            
    }

}
