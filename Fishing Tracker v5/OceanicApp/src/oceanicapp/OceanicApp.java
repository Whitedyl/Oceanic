/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oceanicapp;

import FishingTracker.FishInputGUI;
import FishingTracker.FishermanGUI;
//import Pollution.CleanUpGUI;
//import Pollution.MainAppGUI;
//import Pollution.PollutionGUI;

/**
 *
 * @author Dylan
 */
public class OceanicApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //When the application is run, it sets the main GUI visible.
        
        //create instance of gui
        FishermanGUI fishermanGUI = new FishermanGUI();
        fishermanGUI.setVisible(true);///set it visible
    }

}
