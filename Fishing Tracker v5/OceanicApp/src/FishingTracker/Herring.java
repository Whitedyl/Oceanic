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
    private String age;

    public Herring() {
    }
    public Herring(String age) {
        this.age = age;
    }

    public Herring(String age, String fishID, String colour) {
        super(fishID, colour);
        this.age = age;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
    @Override
    public String printDetails() {
        return "The heriing id is: " + fishID + " colour is: " + colour + " age is: " + age;
    }
}
