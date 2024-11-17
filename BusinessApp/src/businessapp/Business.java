/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businessapp;

/**
 *
 * @author AFF COMPUTERS
 */
public class Business {
    protected String businessName;
    protected double revenue;
    protected double saleAmount;
    protected double overheads;
    protected double profits;

    public Business(){
        
    }
    
    public Business(String businessName, double revenue) {
        this.businessName = businessName;
        this.revenue = revenue;

    }
    
    

    public String getBusinessName() {
        return businessName;
    }

    public double getRevenue() {
        return revenue;
    }

    public double getSaleAmount() {
        return saleAmount;
    }

    public double getOverheads() {
        return overheads;
    }

    public double getProfits() {
        return profits;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }

    public void setSaleAmount(double saleAmount) {
        this.saleAmount = saleAmount;
    }

    public void setOverheads(double overheads) {
        this.overheads = overheads;
    }


    
    //action methods
    public double costCalc(){
        
    }
    public double calcReturn(){
        
    }
    
    
}
