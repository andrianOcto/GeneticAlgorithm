package GUI;


import Basic.Barang;
import Basic.Candidate;
import java.awt.image.BufferedImage;
import java.awt.Graphics;
import java.io.File;
import java.io.IOException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ddr
 */
public class GUIMain extends javax.swing.JFrame {

    /**
     * Creates new form GUIMain
     */
    public GUIMain() {
        ss = new Vector<String>();
        initComponents();
        
        //inisialisasi Progress Bar
        Energi_Progress.setMaximum(100);
        Energi_Progress.setValue(100);
        ss.add("g");
        ss.add("m");
        ss.add("u");
        ss.add("g");
        ss.add("c");
        VB= new Vector<Barang>();
        VC= new Vector<Candidate>();
        //test sound
        
        // from a wave File
         playSong("sound/street-alley-ambience-1.wav");
    }
    
    public GUIMain(Vector<String> CC,int MaxEN,Vector<Barang> BarangJualan,Vector<Candidate> DataKandidat) {
        ss = new Vector<String>(CC);
        VB = BarangJualan;
        VC = DataKandidat;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jFrame1 = new javax.swing.JFrame();
        BG_GUI = new javax.swing.JPanel();
        Nanto_Status = new javax.swing.JPanel();
        Date = new javax.swing.JLabel();
        Record = new javax.swing.JButton();
        Money = new javax.swing.JLabel();
        Enlightment = new javax.swing.JLabel();
        Energi = new javax.swing.JLabel();
        STR = new javax.swing.JLabel();
        Brain = new javax.swing.JLabel();
        Charm = new javax.swing.JLabel();
        Energi_Progress = new javax.swing.JProgressBar();
        STR_val = new javax.swing.JLabel();
        Brain_val = new javax.swing.JLabel();
        Charm_val = new javax.swing.JLabel();
        Money_val = new javax.swing.JLabel();
        Enlightment_val = new javax.swing.JLabel();
        Bag = new javax.swing.JButton();
        DialogName = new javax.swing.JTextArea();
        BG_Place = new javax.swing.JPanel();
        imageLabel = new javax.swing.JLabel();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BG_GUI.setBackground(new java.awt.Color(204, 204, 204));
        BG_GUI.setBorder(new javax.swing.border.MatteBorder(null));

        Nanto_Status.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Date.setText("Date : ");

        Record.setText("Record");
        Record.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecordActionPerformed(evt);
            }
        });

        Money.setText("Money :");

        Enlightment.setText("Enlightment :");

        Energi.setText("Energi ");

        STR.setText("STR");

        Brain.setText("Brain");

        Charm.setText("Charm");

        STR_val.setText("0");

        Brain_val.setText("0");

        Charm_val.setText("0");

        Money_val.setText("10000");

        Enlightment_val.setText("0");

        Bag.setText("Bag");
        Bag.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BagMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Nanto_StatusLayout = new javax.swing.GroupLayout(Nanto_Status);
        Nanto_Status.setLayout(Nanto_StatusLayout);
        Nanto_StatusLayout.setHorizontalGroup(
            Nanto_StatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Nanto_StatusLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Nanto_StatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Nanto_StatusLayout.createSequentialGroup()
                        .addComponent(Money)
                        .addGap(58, 58, 58)
                        .addComponent(Money_val)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(Nanto_StatusLayout.createSequentialGroup()
                        .addGroup(Nanto_StatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Nanto_StatusLayout.createSequentialGroup()
                                .addComponent(Energi)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                                .addComponent(Energi_Progress, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Nanto_StatusLayout.createSequentialGroup()
                                .addGroup(Nanto_StatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(Nanto_StatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(Nanto_StatusLayout.createSequentialGroup()
                                            .addGap(57, 57, 57)
                                            .addGroup(Nanto_StatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(Brain_val)
                                                .addComponent(STR_val)))
                                        .addGroup(Nanto_StatusLayout.createSequentialGroup()
                                            .addComponent(Charm)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(Charm_val)))
                                    .addComponent(Date)
                                    .addComponent(Brain)
                                    .addComponent(STR))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
            .addGroup(Nanto_StatusLayout.createSequentialGroup()
                .addGroup(Nanto_StatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Nanto_StatusLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(Nanto_StatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Bag, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Record, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)))
                    .addGroup(Nanto_StatusLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Enlightment)
                        .addGap(41, 41, 41)
                        .addComponent(Enlightment_val)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        Nanto_StatusLayout.setVerticalGroup(
            Nanto_StatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Nanto_StatusLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Date)
                .addGap(26, 26, 26)
                .addGroup(Nanto_StatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Nanto_StatusLayout.createSequentialGroup()
                        .addGroup(Nanto_StatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Money)
                            .addComponent(Money_val))
                        .addGap(18, 18, 18)
                        .addComponent(Energi))
                    .addComponent(Energi_Progress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(Nanto_StatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(STR)
                    .addComponent(STR_val))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Nanto_StatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Brain)
                    .addComponent(Brain_val))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Nanto_StatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Charm_val)
                    .addComponent(Charm))
                .addGap(29, 29, 29)
                .addGroup(Nanto_StatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Enlightment)
                    .addComponent(Enlightment_val))
                .addGap(42, 42, 42)
                .addComponent(Record)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Bag)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        DialogName.setEditable(false);
        DialogName.setColumns(20);
        DialogName.setRows(5);
        DialogName.setBorder(new javax.swing.border.MatteBorder(null));
        DialogName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DialogNameMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout BG_PlaceLayout = new javax.swing.GroupLayout(BG_Place);
        BG_Place.setLayout(BG_PlaceLayout);
        BG_PlaceLayout.setHorizontalGroup(
            BG_PlaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BG_PlaceLayout.createSequentialGroup()
                .addComponent(imageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        BG_PlaceLayout.setVerticalGroup(
            BG_PlaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BG_PlaceLayout.createSequentialGroup()
                .addComponent(imageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout BG_GUILayout = new javax.swing.GroupLayout(BG_GUI);
        BG_GUI.setLayout(BG_GUILayout);
        BG_GUILayout.setHorizontalGroup(
            BG_GUILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BG_GUILayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BG_GUILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(DialogName)
                    .addGroup(BG_GUILayout.createSequentialGroup()
                        .addComponent(BG_Place, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Nanto_Status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        BG_GUILayout.setVerticalGroup(
            BG_GUILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BG_GUILayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BG_GUILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BG_Place, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Nanto_Status, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DialogName, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(BG_GUI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BG_GUI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DialogNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DialogNameMouseClicked
        // TODO add your handling code here:
        //kamus lokal
   
       
        if (ss.isEmpty()){
            //kalo udah selesai , halaman di itemin , udah gitu  kasih tulisan End.
            DialogName.setText("End !");
            setimageLabel("img/test.jpg");
        
        }
        else {
            //belum selesai , baca lagi list gene nya
            readGene();
            //baca char paling depan 
            
            //check apakah char itu
       
        }
    }//GEN-LAST:event_DialogNameMouseClicked

    private void RecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecordActionPerformed
        // TODO add your handling code here:
        
        Money_val.setText(Integer.toString(Integer.valueOf(Money_val.getText())+1000));
    }//GEN-LAST:event_RecordActionPerformed

    private void BagMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BagMouseClicked
        // TODO add your handling code here:
         IB = new Item_bag();
         IB.runIt();
    }//GEN-LAST:event_BagMouseClicked

    /**
     * @param args the command line arguments
     */
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BG_GUI;
    private javax.swing.JPanel BG_Place;
    private javax.swing.JButton Bag;
    private javax.swing.JLabel Brain;
    private javax.swing.JLabel Brain_val;
    private javax.swing.JLabel Charm;
    private javax.swing.JLabel Charm_val;
    private javax.swing.JLabel Date;
    private javax.swing.JTextArea DialogName;
    private javax.swing.JLabel Energi;
    private javax.swing.JProgressBar Energi_Progress;
    private javax.swing.JLabel Enlightment;
    private javax.swing.JLabel Enlightment_val;
    private javax.swing.JLabel Money;
    private javax.swing.JLabel Money_val;
    private javax.swing.JPanel Nanto_Status;
    private javax.swing.JButton Record;
    private javax.swing.JLabel STR;
    private javax.swing.JLabel STR_val;
    private javax.swing.JLabel imageLabel;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JFrame jFrame1;
    // End of variables declaration//GEN-END:variables

    //ide
    private  BufferedImage myPicture;
    String s; //digunakan untuk menampung gene yang di baca saat ini
    int count; // u/ menghitung apakah sudah satu hari atau belum  count mod 10
    int str;  // STR yang dimiliki oleh nanto
    int brn;  // Brain yang dimiliki Oleh nanto
    int crm;  // Charm yang dimiliki oleh nanto
    int money;  // uang yang dimiliki oleh nanto
    int energy; // energi yang dimiliki oleh nanto
    
    
    Vector<String> ss; //ini buat simpen di GUI list GEN nya gimana
    Vector<Barang> VB; // ini berisikan barang2 yang di jual di toko
    Vector<Candidate> VC; // ini berisikan data2 kandidat yang ada 
    Item_bag IB;
    // List belum implementasi
    /*
     semua char cewe , List cewe
    semua barang yang di jual , list barang
    
    */
    
    //ngide sound
    // from a wave File
    File soundFile;
    AudioInputStream audioIn;
    Clip clip; //tempat play sound nya
    //geter & setter
    
    public void setimageLabel(String s){
        //kamus lokal
        try {
            myPicture = ImageIO.read(new File(s));
            imageLabel.setIcon(new ImageIcon(myPicture));
            //imageLabel = new JLabel(new ImageIcon(myPicture));
        } catch (IOException ex) {
            Logger.getLogger(GUIMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    public void setPBar(int nilai){
        Energi_Progress.setValue(nilai);
    }
    
    public void readGene(){
        
        s =ss.remove(0);
        //check apakah sudah ganti hari
        if(count%3==0){ //ganti hari
            Energi_Progress.setValue(Energi_Progress.getMaximum());
        }
        
        if(s.equals("m")){  //pergi ke mall
               DialogName.setText("\n   Nanto Pergi ke mall !");
               setimageLabel("img/mall.jpg");
               Money_val.setText(Integer.toString(Integer.valueOf(Money_val.getText())+1000));
               Energi_Progress.setValue(Energi_Progress.getValue()-8);
        }
        else if(s.equals("g")){//pergi ke GYM
               DialogName.setText("\n   Nanto Pergi ke GYM !"); 
               setimageLabel("img/GYM.jpg"); 
               STR_val.setText(Integer.toString(Integer.valueOf(STR_val.getText())+2));
               Energi_Progress.setValue(Energi_Progress.getValue()-12);
        }
         else if(s.equals("u")){ //pergi ke Universitas
              
             DialogName.setText("\n     Nanto Pergi ke Universitas !"); 
               setimageLabel("img/universitas.jpg"); 
               Brain_val.setText(Integer.toString(Integer.valueOf(Brain_val.getText())+3));
               Energi_Progress.setValue(Energi_Progress.getValue()-15);
         }
         else if(s.equals("c")){ //pergi ke Cafe
              
               DialogName.setText("\n   Nanto Pergi ke Cafe !"); 
               setimageLabel("img/cafe.jpg"); 
               Charm_val.setText(Integer.toString(Integer.valueOf(Charm_val.getText())+2));
               Energi_Progress.setValue(Energi_Progress.getValue()-6);
         }
         else { //berarti dia beli barang
             try{
             int nokandidat = Integer.parseInt(s);
                             //Nanto bertemu dengan cewek
                //buat loop for sebanyak jumlah cewe
                for(int i =0;i<VC.size();i++){
                    //check apakah sama

                    if(nokandidat== i+1){

                        
                        //tambah enlightment sebanyak enlightment dari cewek itu
                        Enlightment_val.setText(Integer.toString(Integer.valueOf(Enlightment_val.getText())+VC.get(i).enlightmentPerHour));
                        //kurangi energi nanto
                        Energi_Progress.setValue(Energi_Progress.getValue()-15); // dikurangi jumlah energi yang dibutuhkan u/ bertemu
                        //Ganti gambar dengn gambar ketemu cewek itu
                        DialogName.setText("\n  Nanto Pergi Bertemu dengan "+s); //s harus nya ganti nama dari si cewe
                        break;
                    }
                }
             
             }
             catch(NumberFormatException e){
                //gak bisa jadi angka berarti beli barang
                for(int i =0;i<VB.size();i++){
                    //check apakah sama
                    if(s.equals(VB.get(i).kodeBarang)){
                       Money_val.setText(Integer.toString(Integer.valueOf(Money_val.getText())-VB.get(i).harga));
                       //Ganti gambar dengn gambar toko
                       DialogName.setText("\n    Nanto Pergi membeli "+s); //s harus nya ganti nama dari barang
                       break;
                     }
                }
            }
         }
    
    count++; //memastikan i jam telah lewat, asumsi satu hari = 12 jam 10.00 - 22.00
    }


    public void playSong(String s){
            
        try {
            soundFile = new File(s);
            audioIn = AudioSystem.getAudioInputStream(soundFile);
           if(clip!= null){
               if(clip.isRunning()){
                //matoon dulu clip nya
                   clip.stop();
                   clip.close();
            }
           }
            
            clip = AudioSystem.getClip();
            clip.open(audioIn);
            clip.loop(Clip.LOOP_CONTINUOUSLY); 
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(GUIMain.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(GUIMain.class.getName()).log(Level.SEVERE, null, ex);
        } catch (LineUnavailableException ex) {
            Logger.getLogger(GUIMain.class.getName()).log(Level.SEVERE, null, ex);
        }
  
}



    public void playSFX(int i){
        try {
            String name="default.wav";
            
            if(i==1)
                name="test.wav";
            else if (i==2)
                name="test.wav";
            else if (i==3)
                name="test.wav";
            else if (i==4)
                name="test.wav";
                    
               
            File soundFilesfx = new File(name);
            AudioInputStream audioInSFX = AudioSystem.getAudioInputStream(soundFilesfx);

            Clip clipsfx = AudioSystem.getClip();
            clipsfx.open(audioIn);
            
            clipsfx.start();
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(GUIMain.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(GUIMain.class.getName()).log(Level.SEVERE, null, ex);
        } catch (LineUnavailableException ex) {
            Logger.getLogger(GUIMain.class.getName()).log(Level.SEVERE, null, ex);
        }

        
    
    }
    
    public void runIt(){
    this.setVisible(true);
}

}
