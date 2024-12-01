/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FishingTracker;

/**
 *
 * @author Dylan
 */
public class Tuna extends Fish {
    private String weight;

    public Tuna() {
    }

    public Tuna(String weight) {
        this.weight = weight;
    }

    public Tuna(String weight, String fishID, String colour) {
        super(fishID, colour);
        this.weight = weight;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }
    @Override
    public String printDetails() {
        return"The tuna id is: " + fishID + " colour is: " + colour + " weight is: " + weight;
    }
    
}
