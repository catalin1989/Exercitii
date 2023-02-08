package org.example;

import org.example.utils.ScannerUtils;

public class Game {

    ScannerUtils scannerUtils= new ScannerUtils();
    public void start(){
        System.out.println("Welcome to the Racing Game!");
        int playerCount = getPlayerCountFromUser();
        String vehicleName = getVehicleNameFromUser();

        System.out.println("Players vehicle name is: "+vehicleName);
        System.out.println("Player count "+playerCount);
    }

    private int getPlayerCountFromUser(){
        System.out.println("Please enter number of players: ");
       return scannerUtils.nextIntAndMoveToNextLine();
    }

    private String getVehicleNameFromUser(){
        System.out.println("Please enter vehicle name: ");
       return scannerUtils.nextLine();
    }
}
