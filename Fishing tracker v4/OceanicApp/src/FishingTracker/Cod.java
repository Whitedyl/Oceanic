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
    private String length;

    public Cod() {
    }

    public Cod(String weight) {
        this.length = length;
    }

    public Cod(String length, String fishID, String colour) {
        super(fishID, colour);
        this.length = length;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }
    @Override
    public String printDetails() {
        return "The cod's id is: " + fishID + " colour is: " + colour + " length is: " + length;
    }
    
}
