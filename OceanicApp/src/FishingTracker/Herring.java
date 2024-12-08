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
public class Herring extends Fish {
    private int age;

    public Herring() {
    }
    public Herring(int age) {
        this.age = age;
    }

    public Herring(int age, String fishID, String colour) {
        super(fishID, colour); //using super to call from Fish class
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    //Overide the print details from parent class fish
    @Override
    public String printDetails() {
        //update the new printDetils method
        return "The heriing id is: " + fishID + " colour is: " + colour + " age is: " + age;
    }
}
