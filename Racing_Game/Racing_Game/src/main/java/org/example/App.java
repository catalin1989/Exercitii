package org.example;


public class App {
    public static void main(String[] args) {
        
    Car carReference = new Car();

    carReference.name= "Ferrari";
    carReference.maxSpeed= 300;
    carReference.fuelLevel= 60;
    carReference.mileage= 12.5;
    carReference.totalTravelDistance=0;
    carReference.damaged=true;
    carReference.doorCount=1;
    carReference.color= "Red";

    //concatenare
        System.out.println("Properties of cars "+carReference.name);
        System.out.println("Max Speed "+carReference.maxSpeed);
        System.out.println("Fuel level "+carReference.fuelLevel);
        System.out.println("Total travel distance "+carReference.totalTravelDistance);
        System.out.println("Damage "+carReference.damaged);
        System.out.println("Mileage "+carReference.mileage);
        System.out.println("Door count "+carReference.doorCount);
        System.out.println("Color "+carReference.color);
        System.out.println(carReference);

        Car car2= new Car();
        car2.name= "Renno";
       // car2.maxSpeed= 300;
        car2.fuelLevel= 70;
       // car2.mileage= 12.5;
        car2.totalTravelDistance=100;
       // carReference.damaged=true;
       // carReference.doorCount=1;
       // carReference.color= "Red";

        System.out.println("Properties for car2 "+ car2.name);
        System.out.println("Max Speed "+car2.maxSpeed);
        System.out.println("Fuel level "+car2.fuelLevel);
        System.out.println("Total travel distance "+car2.totalTravelDistance);
        System.out.println("Damage "+car2.damaged);
        System.out.println("Mileage "+car2.mileage);
        System.out.println("Door count "+car2.doorCount);
        System.out.println("Color "+car2.color);
        System.out.println(car2);

        System.out.println("Initial name of car1 "+carReference.name);
    carReference.name= "Audi";
        System.out.println("Changed name of car1 "+carReference.name);

        carReference= new Car();
        System.out.println("Name of new car "+carReference.name);
        carReference.name= "BMW";
        carReference=car2;
        System.out.println("Name of carReferenced from 2 variabiles Carreference "+carReference.name);
        System.out.println("Name of carReferenced from 2 variabiles Car2 "+car2.name);

        car2.name= "Dacia";

        System.out.println("Updated name of carReferenced from 2 variabiles Carreference "+carReference.name);
        System.out.println("Updated name of carReferenced from 2 variabiles Car2 "+car2.name);





    }
}



