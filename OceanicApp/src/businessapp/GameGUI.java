/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package businessapp;

import java.awt.Graphics;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.PointerInfo;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

/**
 *
 * @author AFF COMPUTERS
 */
public class GameGUI extends javax.swing.JFrame implements MouseListener{
    private final GUIMain main;
    DrawPane panel;
    
    private int score;
    Player player1;
    ArrayList<Plastic> pList;
    int count=0;
    /**
     * Creates new form gameGUI
     */
   
    //default constructor initializes game and Jframe components
    public GameGUI(GUIMain main) {
        this.main = main;
        panel = new DrawPane();
        player1 = new Player();
        pList = new ArrayList<>();
        setContentPane(panel);
        panel.setTemp(player1);
       
      
        panel.setPList(pList);
        addMouseListener(this);
        initComponents();
    }
    //this is the game loop, it runs until counter reaches 800, i used to thread.sleep() to introduce a delay
    public void game(){
     
        
        
        while(true){
            try{
                Thread.sleep(25);
                moveAction();
                if(count%200==0){
                    addPlastic();
                }
                for(Plastic p:pList){
                    p.move();
                }
                System.out.println(count);
                if(count==800){
                    count=0;
                    break;
                }
                hitDetect();
                collisionDet();
                wallDetection();
             
               
                for(Plastic p:pList){
                    System.out.println(p.getX()+" "+p.getY()+" "+pList.indexOf(p));
                    
                }
                count++;
              
                panel.paintComponent(  panel.getGraphics());
            }
            catch(InterruptedException e){
                System.out.println("error"+e);
            }
        }
       panel.paint(panel.getGraphics());
    }
    //gets the mouse cursor location for x and y and sets player objects x,y attributes to that
    public java.awt.Point moveAction(){
        PointerInfo a = MouseInfo.getPointerInfo();
        Point b = a.getLocation();
        
        
        int x = (int) b.getX();
        int y = (int) b.getY();
        //int x = (int) b.getX();
        //int y = (int) b.getY();
        
        //System.out.println(x +" "+y);
        player1.setX(x);
        player1.setY(y);

        return b;
    }
    //i have these because i implemented mouselistener
    @Override
    public void mouseClicked(MouseEvent e) {
            //System.out.println(e.getX()+" "+e.getY());
          
            
           
           
                  
 
    }

    @Override
    public void mousePressed(MouseEvent e) {
  
    }

    @Override
    public void mouseReleased(MouseEvent e) {
  
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
    //checks if player x and y overlap with plastic position
    public void hitDetect(){
        Plastic temp =new Plastic();
        for(Plastic p: pList){
            if((player1.getX()>p.getX()&&player1.getX()<p.getX()+p.getPlasticWidth()) && (player1.getY()>p.getY()&& player1.getY()<p.getY()+p.getPlasticHeight())){
                System.out.println("hit");
                temp =p;
                score++;
                player1.setScore(score);
            }
        }
        pList.remove(temp);
    }
    //checks if plastics collide with each other, causes strange behaviour sometimes
    public void collisionDet(){
        for(Plastic p: pList){
            for(Plastic p1: pList){
                if(p1.equals(p)){continue;}
                if((p.getX()+p.getPlasticWidth())>=p1.getX()&&p.getX()<p1.getX()){ 
                    if(p.getY()<= (p1.getY()+p1.getPlasticHeight()) && p.getY()>=p1.getY()){
                        p.changeXDirection();
                        p1.changeXDirection();
                    }
                }
                
                if(p.getX()<=(p1.getPlasticWidth()+p1.getX())&&p.getX()>p1.getX()){
                    if(p.getY()<= (p1.getY()+p1.getPlasticHeight()) && p.getY()>=p1.getY()){
                    p.changeXDirection();
                    p1.changeXDirection();
                    }
                }
                if(p.getY()<=(p1.getY()+p1.getPlasticHeight())&&p.getY()>p1.getY()){
                    if(p.getX()<=(p1.getX()+p1.getPlasticWidth())&&p.getX()>=p1.getX()){
                        p1.changeYDirection();
                        p.changeYDirection();
                    }
                }
                if((p.getY()+p.getPlasticHeight())>=p1.getY()&&p.getY()<p1.getY()){
                    if(p.getX()<=(p1.getX()+p1.getPlasticWidth())&&p.getX()>=p1.getX()){
                      
                        p.changeYDirection();
                        p1.changeYDirection();
                    }
                }
            }     
        }
    }
   //checks if plastic hits the game wall and changes their direction attribute
    public void wallDetection(){    
        for(Plastic p:pList){
            if(p.getX()+p.getPlasticWidth()>panel.getPaneWidth()){
                p.changeXDirection();
            }
            if(p.getX()<0){
                p.changeXDirection();
            }
            if(p.getY()<0){
                p.changeYDirection();
            }
            if(p.getY()+p.getPlasticHeight()>panel.getPaneHeight()){
                p.changeYDirection();
            }
        }
    }
    //adds a new plastic instance to the pList
    public void addPlastic(){
        Plastic temp;
        int plasticPosX= (int)(Math.random()*panel.getPaneWidth());
        int plasticPosY= (int)(Math.random()*panel.getPaneHeight());
        temp = new Plastic(plasticPosX,plasticPosY);
        if (temp.getX()+temp.getPlasticWidth() > panel.getPaneWidth()){
            temp.setX(panel.getPaneWidth()-temp.getPlasticWidth());
        }
        if(temp.getY()+temp.getPlasticHeight()>panel.getPaneHeight()){
            temp.setY(panel.getPaneHeight()-temp.getPlasticHeight());
        }
        pList.add(temp);
        
    }

 

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        exitBTN = new javax.swing.JButton();
        startBTN = new javax.swing.JButton();
        restartLBL = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        exitBTN.setText("Exit");
        exitBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBTNActionPerformed(evt);
            }
        });

        startBTN.setText("Start Game");
        startBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startBTNActionPerformed(evt);
            }
        });

        restartLBL.setText("Restart");
        restartLBL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restartLBLActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(restartLBL)
                        .addGap(28, 28, 28)
                        .addComponent(exitBTN))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 655, Short.MAX_VALUE)
                        .addComponent(startBTN)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(441, Short.MAX_VALUE)
                .addComponent(startBTN)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exitBTN)
                    .addComponent(restartLBL))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBTNActionPerformed
        // TODO add your handling code here:
        main.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_exitBTNActionPerformed

    private void startBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startBTNActionPerformed
        // TODO add your handling code here:
       
       game();
    }//GEN-LAST:event_startBTNActionPerformed

    private void restartLBLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restartLBLActionPerformed
        // TODO add your handling code here:
        
        pList.clear();
        player1 =  new Player();
        panel.setTemp(player1);
        score=0;
    }//GEN-LAST:event_restartLBLActionPerformed

    /**
     * @param args the command line arguments
     */
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exitBTN;
    private javax.swing.JButton restartLBL;
    private javax.swing.JButton startBTN;
    // End of variables declaration//GEN-END:variables
}
