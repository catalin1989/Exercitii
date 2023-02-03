package org.example;

public class Vehicle {
    String name;
    double fuelLevel;
    double mileage;
    double totalTravelDistance;

    double maxSpeed;
    boolean damaged;
    String color;

    public double accelerate(double speed, double durationInHours){

        System.out.println(name+"is accelerating with "+speed+"km/h "+ durationInHours+"h");

        double distance= speed*durationInHours;

        totalTravelDistance=totalTravelDistance+distance;

        System.out.println("Total travel distance for vehicle "+ name+": "+totalTravelDistance);
        double usedFuel=distance*mileage/100;
        fuelLevel-=usedFuel;
        System.out.println("Remaining fuel for vehicle "+ name+": "+fuelLevel);


        return distance;
    }
}
