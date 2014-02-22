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
public class Tempat {
    
    public String nama;
    public String kode;
    public int moneyAdd;
    public int strengthAdd;
    public int charmAdd;
    public int brainAdd;
    public int energyNeed;
    
    public int[][] availability;//ARRAY OF ARRAYLIST YANG MENCATAT JAM DALAM SEMINGGU, ISI ARRAY DENGAN 7
    
    //CTOR
    public Tempat(String n, int ma, int sa, int ca,int ba, int en) {
        nama = n;
        moneyAdd = ma;
        strengthAdd = sa;
        charmAdd = ca;
        brainAdd = ba;
        energyNeed = en;
        availability = new int[7][12];
    }
}
