/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businessapp;

/**
 *
 * @author AFF COMPUTERS
 */
public class Manufacturing extends Business {
    private int compostable;
    private double packagingCost;
    private int unitsSold;
    private double machineryCost;
    private double grant;

    public Manufacturing(String businessName, double revenue, int compostable, int unitsSold, double machineryCost) {
        super(businessName, revenue);
        this.compostable = compostable;
        this.unitsSold = unitsSold;
        this.machineryCost = machineryCost;
    }

    public int getCompostable() {
        return compostable;
    }

    public int getUnitsSold() {
        return unitsSold;
    }

    public double getMachineryCost() {
        return machineryCost;
    }

    public void setCompostable(int compostable) {
        this.compostable = compostable;
    }

    public void setUnitsSold(int unitsSold) {
        this.unitsSold = unitsSold;
    }

    public void setMachineryCost(double machineryCost) {
        this.machineryCost = machineryCost;
    }
    
    //action methods
    @Override
    public double costCalc(){
        
    }
    public double plasticCalc(){
        
    }
    public int esgCalc(){
        
    }
    
}
