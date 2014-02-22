/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Basic;

import geneticalgorithm.GeneticAlgorithm;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hp
 */
public class ReadData {
    
    public void readFromData (ArrayList<Candidate> listCand, ArrayList<Barang> listBarang) {
        // TODO code application logic here
         try {        
            // TODO code application logic here

        Scanner fileIn;
            fileIn = new Scanner(new File("BarangCandidate.txt"));
        while(fileIn.hasNext()) {
            int str, m, c, b, e, maxM, me, n, eph, enph, mph, sc, cc, bc, hrg, stck;
            
            char kbrg;
            
            Candidate cand;
            Barang brg;
            String kp;
            m = Integer.parseInt(fileIn.next());
            maxM = Integer.parseInt(fileIn.next());
            e = Integer.parseInt(fileIn.next());
            str = Integer.parseInt(fileIn.next());
            c = Integer.parseInt(fileIn.next());
            b = Integer.parseInt(fileIn.next());
            Nanto naruto = new Nanto(str, m, c, b, e, 0, e);
            n = Integer.parseInt(fileIn.next());
            for (int i = 0; i < n; i++) {
                ArrayList<Character> kb = new ArrayList<>();
               eph = Integer.parseInt(fileIn.next()); 
               enph = Integer.parseInt(fileIn.next());
               mph = Integer.parseInt(fileIn.next());
               kp = fileIn.next();
               for (int j = 0; j < kp.length(); j++) {
                   kb.add(kp.charAt(j));
               }
               sc = Integer.parseInt(fileIn.next());
               cc = Integer.parseInt(fileIn.next());
               bc= Integer.parseInt(fileIn.next());
               cand = new Candidate(eph, enph,mph, kb, sc, cc, bc);
               listCand.add(cand);
               
            }
            
            n = Integer.parseInt(fileIn.next());
            for (int i = 0; i < n; i++) {
               kbrg = fileIn.next().charAt(0);
               hrg = Integer.parseInt(fileIn.next());
               stck = Integer.parseInt(fileIn.next());
               brg = new Barang(kbrg, hrg, stck, stck);
               listBarang.add(brg);
               
            }
            
            
       
       
            
        
        
        
        
       
        /*System.out.println(M.getJenis());*/
        }
        
        
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GeneticAlgorithm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void readTempat(ArrayList<Tempat> tempats){
        //INISIALISASI SCANNER
        Scanner fileIn;
        
        try{
            fileIn = new Scanner("tempat.txt");

            ArrayList<Tempat> TTempats = new ArrayList<Tempat>();

            //MENGISI MALL
            Tempat tempat = new Tempat("Mall", 10000, 0, 0, 0, 8);
            tempat.kode = "m";
            for(int i = 0;i<7;i++){
                for(int j = 0;j<12;j++){
                    tempat.availability[i][j] = fileIn.
                }
            }
        }catch(Exception e){
            
        }
        
    }
}
