/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Basic;

/**
 *
 * @author HP
 */
public class Barang {
    
   
    public char kodeBarang;
    public int harga;
    public int dailyRestock;
    public int stock;
	//CTOR
    public Barang( char kB, int h, int dS, int j) {
		
		kodeBarang = kB;
		harga = h;
		dailyRestock = dS;
		stock = j;
	}
}
