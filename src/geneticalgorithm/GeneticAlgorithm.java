/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package geneticalgorithm;

import Basic.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class GeneticAlgorithm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Candidate> listcand = new ArrayList<>();
        ArrayList<Tempat> listtempat;
        ArrayList<Barang> listbarang = new ArrayList<>();
        
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
               listcand.add(cand);
               
            }
            
            n = Integer.parseInt(fileIn.next());
            for (int i = 0; i < n; i++) {
               kbrg = fileIn.next().charAt(0);
               hrg = Integer.parseInt(fileIn.next());
               stck = Integer.parseInt(fileIn.next());
               brg = new Barang(kbrg, hrg, stck, stck);
               listbarang.add(brg);
               
            }
            
            
       
       
            System.out.print(listcand.get(3).kodePreq.get(0));
        
        
        
        
       
        /*System.out.println(M.getJenis());*/
        }
        
        
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GeneticAlgorithm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
