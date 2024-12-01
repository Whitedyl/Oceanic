/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FishingTracker;

/**
 *
 * @author Dylan
 */
public class Fish {
    String id, colour;

    public Fish() {
    }

    public Fish(String id, String colour) {
        this.id = id;
        this.colour = colour;
    }

    public String getId() {
        return id;
    }

    public String getColour() {
        return colour;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
    public void printDetails() {
        System.out.println("The fish id is: " + id + "colour is: " + colour);
    }
            
}
