/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FishingTracker;

/**
 *
 * @author Dylan
 */
public class Cod extends Fish {
    String weight;

    public Cod() {
    }

    public Cod(String weight) {
        this.weight = weight;
    }

    public Cod(String weight, String id, String colour) {
        super(id, colour);
        this.weight = weight;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }
    @Override
    public void printDetails() {
        System.out.println("The cod's id is: " + id + "colour is: " + colour + "weight is: " + weight);
    }
    
}
