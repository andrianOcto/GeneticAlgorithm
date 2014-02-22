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
public class Candidate {
    public int enlightmentPerHour;
    public int maxHourPerDay;
    public int energyPerDay;
    public ArrayList<Character> kodePreq;
    
    public int strengthMin;
    public int charmMin;
    public int brainMin;
    public int[][] availability;//ARRAY OF ARRAYLIST YANG MENCATAT JAM DALAM SEMINGGU, ISI ARRAY DENGAN 7
	
	//CTOR
	public Candidate(int eph, int enpd, int mhpd, ArrayList<Character> kode, int strmin, int charmin, int brainmin) {
		enlightmentPerHour = eph;
                energyPerDay = enpd;
		maxHourPerDay = mhpd;
		kodePreq = kode;
		strengthMin = strmin;
		charmMin = charmin;
		brainMin = brainmin;
                availability = new int[7][12];
	}
}


