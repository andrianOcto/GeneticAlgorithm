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
    
    public void readFromData (ArrayList<Candidate> listCand, ArrayList<Barang> listBarang, Nanto naruto) {
        // TODO code application logic here
         try {        
            // TODO code application logic here

        Scanner fileIn;
            fileIn = new Scanner(new File("BarangCandidate.txt"));
        while(fileIn.hasNext()) {
            int str, m, c, b, e, maxM, me, n, eph, enph, mph, sc, cc, bc, hrg, stck;
            
            String kbrg;
            
            Candidate cand;
            Barang brg;
            String kp;
            m = Integer.parseInt(fileIn.next());
            maxM = Integer.parseInt(fileIn.next());
            e = Integer.parseInt(fileIn.next());
            str = Integer.parseInt(fileIn.next());
            c = Integer.parseInt(fileIn.next());
            b = Integer.parseInt(fileIn.next());
            
            naruto.strength = str;
            naruto.brain = b;
            naruto.charm = c;
            naruto.energy = e;
            naruto.maxEnergy = e;
            naruto.money = m;
            
            n = Integer.parseInt(fileIn.next());
            Character kbc;
            String skb;
            for (int i = 0; i < n; i++) {
                ArrayList<String> kb = new ArrayList<>();
               eph = Integer.parseInt(fileIn.next()); 
               enph = Integer.parseInt(fileIn.next());
               mph = Integer.parseInt(fileIn.next());
               kp = fileIn.next();
               
               for (int j = 0; j < kp.length(); j++) {
                   kbc = kp.charAt(j);
                   kb.add(kbc.toString());
               }
               sc = Integer.parseInt(fileIn.next());
               cc = Integer.parseInt(fileIn.next());
               bc= Integer.parseInt(fileIn.next());
               cand = new Candidate(eph, enph,mph, kb, sc, cc, bc);
               listCand.add(cand);
               
            }
            
            n = Integer.parseInt(fileIn.next());
            for (int i = 0; i < n; i++) {
               kbrg = fileIn.next();
               hrg = Integer.parseInt(fileIn.next());
               stck = Integer.parseInt(fileIn.next());
               brg = new Barang(kbrg, hrg, stck, stck);
               listBarang.add(brg);
               Barang brgnnto = new Barang(kbrg, hrg, stck, 0);
               naruto.inventory.add(brgnnto);
               
               
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
            fileIn = new Scanner(new File("tempat.txt"));

            ArrayList<Tempat> TTempats = new ArrayList<Tempat>();

            //MENGISI MALL
            Tempat tempat = new Tempat("Mall", 10000, 0, 0, 0, 8);
            tempat.kode = "m";
            String availability = fileIn.nextLine();
            for(int i = 0;i<7;i++){
                for(int j = 0;j<12;j++){
                    tempat.availability[i][j] = availability.charAt(j+i*12) - 48;
                }
            }
            tempats.add(tempat);
            
            //MENGISI GYMNASIUM
            tempat = new Tempat("Gymnasium", 0, 2, 0, 0, 12);
            tempat.kode = "g";
            availability = fileIn.nextLine();
            for(int i = 0;i<7;i++){
                for(int j = 0;j<12;j++){
                    tempat.availability[i][j] = availability.charAt(j+i*12) - 48;
                }
            }
            tempats.add(tempat);
            
            //MENGISI CAFE
            tempat = new Tempat("Cafe", 0, 0, 2, 0, 6);
            tempat.kode = "c";
            availability = fileIn.nextLine();
            for(int i = 0;i<7;i++){
                for(int j = 0;j<12;j++){
                    tempat.availability[i][j] = availability.charAt(j+i*12) - 48;
                }
            }
            tempats.add(tempat);
            
            //MENGISI UNIVERSITY
            tempat = new Tempat("University", 0, 0, 0, 3, 15);
            tempat.kode = "u";
            availability = fileIn.nextLine();
            for(int i = 0;i<7;i++){
                for(int j = 0;j<12;j++){
                    tempat.availability[i][j] = availability.charAt(j+i*12) - 48;
                }
            }
            tempats.add(tempat);
            //tempats = TTempats;
            fileIn.close();
            /*for(int i = 0;i<tempats.size();i++){
                for(int j = 0;j<7;j++){
                    for(int k = 0;k<12;k++){
                        System.out.print(tempats.get(i).availability[j][k]);
                    }
                }
                System.out.println();
            }*/
            
            
        }catch(Exception e){
            
        }
        
    }
    
    public void readCandidate(ArrayList<Candidate> candidates){
        
        //INISIALISASI
        Scanner fileIn;
        
        try{
            fileIn = new Scanner(new File("candidate.txt"));
            for(int k = 0;k<candidates.size();k++){
                String availability = fileIn.nextLine();
                for(int i = 0;i<7;i++){
                    for(int j = 0;j<12;j++){
                        candidates.get(k).availability[i][j] = availability.charAt(j+i*12) - 48;
                    }
                }
            }
            fileIn.close();
        
        }catch(Exception e){
            
        }
    }
}
