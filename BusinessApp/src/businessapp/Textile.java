/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businessapp;

/**
 *
 * @author AFF COMPUTERS
 */
public class Textile extends Business{
    private double naturalTextile;
    private int  itemsSold;
    private double  textileCost;
    private double upgradeCost;
    private double grant;

    public Textile(String businessName, double revenue, int itemsSold, double textileCost, double upgradeCost) {
        super( businessName, revenue);
        this.itemsSold = itemsSold;
        this.textileCost = textileCost;
        this.upgradeCost = upgradeCost;
    }

    public int getItemsSold() {
        return itemsSold;
    }

    public double getTextileCost() {
        return textileCost;
    }

    public double getUpgradeCost() {
        return upgradeCost;
    }

    public void setItemsSold(int itemsSold) {
        this.itemsSold = itemsSold;
    }

    public void setTextileCost(double textileCost) {
        this.textileCost = textileCost;
    }

    public void setUpgradeCost(double upgradeCost) {
        this.upgradeCost = upgradeCost;
    }

    //action methods
    public void textileCalc(){
        
    }
    @Override
    public double costCalc(){
        
    }
    public double plasticCalc(){
        
    }
    public int esgCalc(){
        
    }


}


