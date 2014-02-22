/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package geneticalgorithm;

import java.util.Random;
import java.util.Vector;

/**
 *
 * @author octo
 */
public class Schedule {
    public Vector<String> kegiatan;
// Number of crossover points of parent's class tables
	int _numberOfCrossoverPoints;

	// Number of classes that is moved randomly by single mutation operation
	int _mutationSize;

	// Probability that crossover will occure
	int _crossoverProbability;

	// Probability that mutation will occure
	int _mutationProbability;

	// Fitness value of chromosome
	float _fitness;

	// Flags of class requiroments satisfaction
	Vector<Boolean> _criteria;

    public Schedule() {
       kegiatan=new Vector<>();
    }
    public void print()
    {
        for(int i=0;i<kegiatan.size();i++)
        {
            System.out.print(" "+kegiatan.get(i)); 
            
            if ((i+1) % 12 == 0 )
            {
                System.out.println();
            }
        }
    }
    public void crossOver(Schedule parrent2)
    {
        Random rand = new Random();
        int random=rand.nextInt((parrent2.kegiatan.size()+1));
        
        for(int i=random;i<parrent2.kegiatan.size();i++)
        {
            kegiatan.set(i, parrent2.kegiatan.get(i));
        }
    }
}
    
    

