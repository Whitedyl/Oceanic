/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businessapp;

import java.awt.Color;

/**
 *
 * @author Gavin Murphy 
 */
public class Plastic {
    private int x;
    private int y;
    private int xDirection =1;
    private int yDirection=1;
    private int plasticWidth;
    private int plasticHeight;
    private java.awt.Color plasticColor= new java.awt.Color(173,100,100);

    
    public Plastic(){
        
    }
    //overloaded constructor for x and y
    public Plastic(int x, int y) {
        this.x = x;
        this.y = y;
        plasticSize();
        plasticColor();
    }
    

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getxDirection() {
        return xDirection;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setxDirection(int direction) {
        this.xDirection = direction;
    }

    public Color getColor() {
        return plasticColor;
    }

    public void setColor(Color Color) {
        this.plasticColor = Color;
    }

    public int getyDirection() {
        return yDirection;
    }

    public void setyDirection(int yDirection) {
        this.yDirection = yDirection;
    }
    
    //sets the plastic size to a random number between 10 and 100
    public void plasticSize(){
        plasticWidth=(int)((Math.random()*90)+10);
        plasticHeight=(int)((Math.random()*90)+10);
        
        //System.out.println(Y);
       
    }
    //changes x and y directions to multiplying by -1
    public void changeXDirection(){
        xDirection = xDirection*-1;
    }
    public void changeYDirection(){
        yDirection = yDirection*-1;
    }
    //randomly chooses a plastic color
    public void plasticColor(){
        java.awt.Color color1= new java.awt.Color(255,0,0);
        java.awt.Color color2= new java.awt.Color(0,255,0);
        java.awt.Color color3= new java.awt.Color(0,0,255);
        int colorChoice=(int)(Math.random()*3);
        if(colorChoice ==1){
            plasticColor=color1;
        }else if(colorChoice==2){
            plasticColor = color2;
        }else{
            plasticColor = color3;
        }
    }

    public int getPlasticWidth() {
        return plasticWidth;
    }

    public int getPlasticHeight() {
        return plasticHeight;
    }
    //this method allows the plastic to move
    public void move(){
        x=x+xDirection;
        y=y+yDirection;
    }
}
