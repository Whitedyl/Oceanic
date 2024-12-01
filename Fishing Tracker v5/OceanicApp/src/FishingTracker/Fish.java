/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FishingTracker;

import java.io.Serializable;

/**
 *
 * @author Dylan
 */
public class Fish implements Serializable {
    protected String fishID, colour;

    public Fish() {
    }

    public Fish(String fishID, String colour) {
        this.fishID = fishID;
        this.colour = colour;
    }

    public String getFishID() {
        return fishID;
    }

    public String getColour() {
        return colour;
    }

    public void setFishID(String fishID) {
        this.fishID = fishID;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
    public String printDetails() {
        return "The fish id is: " + fishID + "colour is: " + colour;
    }
            
}
