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
    String age;

    public Tuna() {
    }

    public Tuna(String age) {
        this.age = age;
    }

    public Tuna(String age, String id, String colour) {
        super(id, colour);
        this.age = age;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
    @Override
    public void printDetails() {
        System.out.println("The tuna id is: " + id + "colour is: " + colour + "age is: " + age);
    }
    
}
