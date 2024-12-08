/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businessapp;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author Gavin Murphy
 * The DrawPane extends the Jpanel, i did this so i could override the paintComponent and draw on
 * the J panel
 */
class DrawPane extends JPanel {
       
        private final java.awt.Color textColor= new java.awt.Color(0,0,230);
        private  Player temp;
        private ArrayList<Plastic> pList;
        private final int paneWidth = 750;
        private final int paneHeight =511;
        
        @Override
        public void paintComponent(Graphics g) {
            //g.drawLine(x, y, x, y);
    
            //this.setBackground(new java.awt.Color(173, 216, 230));
            super.paintComponent(g);
            g.setColor(temp.getColor());
            //g.fillRect(this.x, this.y, 100, 200); // Draw on g here e.g.
            //g.drawOval(temp.getX(), temp.getY(), 5, 5);
            g.fillOval(temp.getX(), temp.getY(), 5, 5);
            for(Plastic p:pList){
                g.setColor(p.getColor());
                g.fillOval(p.getX(), p.getY(), p.getPlasticWidth(), p.getPlasticHeight());//x,y upper left
            }
            //g.dispose();
            g.setColor(textColor);
            g.drawString("Score: "+temp.getScore(), 50, 50);
            g.drawString("Shoot the Plastic", 320, 50);
            
            
        }
      

        public void setTemp(Player temp) {
            this.temp = temp;
        }

        public void setPList(ArrayList<Plastic> pList) {
            this.pList = pList;
        }

        public int getPaneWidth() {
            return paneWidth;
        }

        public int getPaneHeight() {
            return paneHeight;
    }
        
   }