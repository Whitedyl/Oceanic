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
public class Cod extends Fish {
    private int length;

    public Cod() {
    }

    public Cod(int length) {
        this.length = length;
    }

    public Cod(int length, String fishID, String colour) {
        super(fishID, colour); //inheriting from partent class Fish
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
    //Overide the print details from parent class fish
    @Override
    public String printDetails() {
        //update the new printDetils method
        return "The cod's id is: " + fishID + " colour is: " + colour + " length is: " + length;
    }
    
}
