/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pollution;

/**
 *
 * @author Virginiah,
 */
public class PollutionApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Setting the pollution GUI to be visible when the application is run
        PollutionGUI pollutionGUI = new PollutionGUI();
        pollutionGUI.setVisible(true);
        
        //Setting cleanUp GUI to be hidden.
        CleanUpGUI cleanUpFrame = new CleanUpGUI();
        cleanUpFrame.setVisible(false);
        
        
    }
    
}
