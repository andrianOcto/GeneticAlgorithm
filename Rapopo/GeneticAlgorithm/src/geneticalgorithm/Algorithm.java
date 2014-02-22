/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package geneticalgorithm;

import Basic.Barang;
import Basic.Candidate;
import Basic.Nanto;
import Basic.ReadData;
import Basic.Tempat;
import java.util.ArrayList;
import java.util.Random;
import java.util.Vector;

/**
 *
 * @author octo
 */
public class Algorithm {
    public final int jam=12;
    public int hari;
    public Vector<Schedule> Cromosome;
    public Vector<Integer> indexOfBestCromosome;
    public Vector<Boolean> boolOfBestCromosome;
    public int currentGeneration;
    public int replaceByGeneration;
    public ArrayList<Barang> itemStore;
    public ArrayList<Candidate> candidates;
    public ArrayList<Tempat> tempats;
    
    public void restock(){
        for (Barang temp : itemStore) {
            temp.stock=temp.dailyRestock;
        }
    }
    public Algorithm(int hari,int jumlah) {
        
        //TEST CASE DUMMY
        candidates = new ArrayList<>();
        itemStore = new ArrayList<>();
        tempats = new ArrayList<>();
        ReadData datas;
        datas = new ReadData();
        Nanto test=new Nanto();
        datas.readFromData(candidates, itemStore,test);
        datas.readTempat(tempats);
        datas.readCandidate(candidates);
        
        /*for(int i = 0;i<candidates.size();i++){
            for(int j = 0;j<7;j++){
                for(int k = 0;k<12;k++){
                    System.out.print(tempats.get(i).availability[j][k]);
                }
            }
            System.out.println();
        }*/
        
        this.hari = hari;
        Cromosome=new Vector<>();
        
        
        for(int j=0;j<jumlah;j++)
        {
            Schedule prototype=new Schedule();
            for(int i=0;i<hari*12;i++)
            {
                
                //System.out.println("i = " +  i);
                int tempI=i+1;
                //System.out.println(tempI);
                System.out.println(tempI);
                if((tempI%12)==0)
                {
                    System.out.println("haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
                    restock();
                    test.energy = test.maxEnergy;
                }
                Random rand = new Random();
                int randType=rand.nextInt(4);
                if(randType==0)
                {
                     prototype.kegiatan.add(Integer.toString(0));
                }
                if(randType==1)
                {
                    
                    Random rand2 = new Random();
                    int index=rand2.nextInt(tempats.size());
                    if(test.energy<tempats.get(index).energyNeed)
                    {
                     i--;   
                    }
                    else
                    {
                    test.brain+=tempats.get(index).brainAdd;
                    test.charm+=tempats.get(index).charmAdd;
                    test.money+=tempats.get(index).moneyAdd;
                    test.strength+=tempats.get(index).strengthAdd;
                    test.energy-=tempats.get(index).energyNeed;
                    
                    prototype.kegiatan.add(tempats.get(index).kode);
                    test.printStatusNanto();
                    }
                }
                if(randType==2)
                {
                    Random rand2 = new Random();
                    int index=rand2.nextInt(itemStore.size());
                    if(test.money<itemStore.get(index).harga || itemStore.get(index).stock==0)
                    {
                        i--;
                    }
                    else
                    {
                    test.money-=itemStore.get(index).harga;
                    test.addBarang(itemStore.get(index).kodeBarang);
                    prototype.kegiatan.add(itemStore.get(index).kodeBarang);
                    test.printStatusNanto();
                    }
                }
                if(randType==3)
                {
                    Random rand2 = new Random();
                    int index=rand2.nextInt(candidates.size());
                    boolean haveBarang=true;
                    for (String barangNanto : candidates.get(index).kodePreq) {
                        if(!test.cekBarang(barangNanto))
                        {
                            haveBarang=false;
                        }
                    }
                    boolean jadwal=false;
                    boolean kandidate=true;
                    int temp=i+1;
                    int counter=0;
                    for(int p=(temp/12)*12;p<prototype.kegiatan.size();p++)
                    {
                        if(prototype.kegiatan.get(p).equals(Integer.toString(index)))
                        {
                            counter++;
                        }
                        if(counter==candidates.get(index).maxHourPerDay)
                        {
                            kandidate=false;
                            break;
                        }
                    }
                    
                    if(candidates.get(index).availability[(temp/12)%7][temp%12]==1)
                    {
                        jadwal=true;
                    }
                    if(test.strength<candidates.get(index).strengthMin || test.energy<candidates.get(index).energyPerDay || test.charm<candidates.get(index).charmMin || test.brain<candidates.get(index).brainMin || !haveBarang || !jadwal ||!kandidate)
                    {
                        i--;
                    }
                    else
                    {
                        prototype.kegiatan.add(Integer.toString(index));
                        for (String temp2 : candidates.get(index).kodePreq) {
                        test.removeBarang(temp2);                             
                        }   
                        test.enlightment+= candidates.get(index).enlightmentPerHour;
                        test.energy-=candidates.get(index).energyPerDay;
                        test.printStatusNanto();
                    }
                }
                //int random=rand.nextInt((tempats.size()+itemStore.size()+candidates.size()+1));
                
                //prototype.kegiatan.add(random);
            }
            Cromosome.add(prototype);
        }
        
    }
    public void start()
    {
        for (Schedule schedule : Cromosome) {
            schedule.print();
            System.out.println();
        }
    }
    
    
} 
