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
public class Fisherman implements Serializable {
    private String name, fishermanID, fishingArea, fishingLevel;
    private int age;

    public Fisherman() {
    }

    public Fisherman(String name, String fishermanID, String fishingArea, String fishingLevel, int age) {
        this.name = name;
        this.fishermanID = fishermanID;
        this.fishingArea = fishingArea;
        this.fishingLevel = fishingLevel;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getFishermanID() {
        return fishermanID;
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

    public void setFishermanID(String fishermanID) {
        this.fishermanID = fishermanID;
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
        return "Name: " + name + " ID: " + fishermanID + " Fishing Area: " + fishingArea + " Fishing Level: " + fishingLevel;
    }
    
    
}
