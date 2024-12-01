/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FishingTracker;

/**
 *
 * @author Dylan
 */
public class Fisherman {
    private String name, id, fishingArea, fishingLevel;
    private int age;

    public Fisherman() {
    }

    public Fisherman(String name, String id, String fishingArea, String fishingLevel, int age) {
        this.name = name;
        this.id = id;
        this.fishingArea = fishingArea;
        this.fishingLevel = fishingLevel;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getFishingArea() {
        return fishingArea;
    }

    public String getFishingLevel() {
        return fishingLevel;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setFishingArea(String fishingArea) {
        this.fishingArea = fishingArea;
    }

    public void setFishingLevel(String fishingLevel) {
        this.fishingLevel = fishingLevel;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public String printDetails() {
        return "Name: " + name + " ID: " + id + " Fishing Area: " + fishingArea + " Fishing Level: " + fishingLevel;
    }
    
    
}
