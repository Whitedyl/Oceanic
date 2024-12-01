/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FishingTracker;

/**
 *
 * @author Dylan
 */
public class Herring extends Fish {
    private String length;

    public Herring() {
    }
    public Herring(String length) {
        this.length = length;
    }

    public Herring(String length, String id, String colour) {
        super(id, colour);
        this.length = length;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }
    @Override
    public void printDetails() {
        System.out.println("The heriing id is: " + id + "colour is: " + colour + "length is: " + length);
    }
}
