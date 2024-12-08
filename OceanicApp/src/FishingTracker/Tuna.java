/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FishingTracker;

/**
 *
 * @author Dylan
 */
//inheriting from partent class Fish
public class Tuna extends Fish {
    private int weight;

    public Tuna() {
    }

    public Tuna(int weight) {
        this.weight = weight;
    }

    public Tuna(int weight, String fishID, String colour) {
        super(fishID, colour); //using super to call from Fish class
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    //Overide the print details from parent class fish
    @Override
    public String printDetails() {
        //update the new printDetils method
        return"The tuna id is: " + fishID + " colour is: " + colour + " weight is: " + weight;
    }
    
}
