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
        ReadData read = new ReadData();
        
        read.readFromData(listcand, listbarang);
        
        System.out.print(listcand.get(1).kodePreq.get(0));
        
        /*ArrayList<Tempat> tempats = new ArrayList<>();
        ReadData datas = new ReadData();
        datas.readTempat(tempats);
        for(int i = 0;i<tempats.size();i++){
            for(int j = 0;j<7;j++){
                for(int k = 0;k<12;k++){
                    System.out.print(tempats.get(i).availability[j][k]);
                }
            }
        }*/        
    }
}
