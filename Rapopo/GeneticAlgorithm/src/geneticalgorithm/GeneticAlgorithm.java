/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package geneticalgorithm;

import java.util.Random;

/**
 *
 * @author octo
 */
public class GeneticAlgorithm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Algorithm test=new Algorithm(14, 4);
        test.start();
        Random rand = new Random();
        
        int o=26+1;
        String p=Integer.toString(o- (o/12)*12);
        System.out.println(p);
        test.Cromosome.get(0).crossOver(test.Cromosome.get(1));
        test.start();
    }
}
