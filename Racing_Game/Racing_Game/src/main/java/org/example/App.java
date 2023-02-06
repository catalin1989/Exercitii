package org.example;


public class App {
    public static void main(String[] args) {
        Engine autoVehicleEngine= new Engine();
        autoVehicleEngine.manufacturer= "Volkswagen";
        Autovehicle autovehicle= new Autovehicle(autoVehicleEngine);

        Engine engine1= new Engine();
        engine1.manufacturer= "Ferrari";
        engine1.capacity= 3000;

    Car carReference = new Car(engine1);

    carReference.name= "Ferrari";
    carReference.maxSpeed= 300;
    carReference.fuelLevel= 60;
    carReference.mileage= 12.5;
    carReference.totalTravelDistance=0;
    carReference.damaged=false;
    carReference.doorCount=1;
    carReference.color= "Red";



        System.out.println("Engine1 capacity "+ engine1.capacity);
        System.out.println("CarReference capacity "+ carReference.engine.capacity);

        engine1.capacity=4000;
        System.out.println("CarReference capacity after upgrade "+ carReference.engine.capacity);


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

        Car car2= new Car(new Engine());
        car2.name= "Renno";
        car2.maxSpeed= 300;
        car2.fuelLevel= 70;
        car2.mileage= 10;
        car2.totalTravelDistance=100;
       // carReference.damaged=true;
       // carReference.doorCount=1;
       // carReference.color= "Red";

        car2.engine.capacity=2000;
        System.out.println("Properties for car2 "+ car2.name);
        System.out.println("Max Speed "+car2.maxSpeed);
        System.out.println("Fuel level "+car2.fuelLevel);
        System.out.println("Total travel distance "+car2.totalTravelDistance);
        System.out.println("Damage "+car2.damaged);
        System.out.println("Mileage "+car2.mileage);
        System.out.println("Door count "+car2.doorCount);
        System.out.println("Color "+car2.color);
        System.out.println(car2);

        System.out.println("****************************************************");

       double distanceForCar1= carReference.accelerate(60,1);

        double distanceForCar2= car2.accelerate(130, 1);

        System.out.println("Engine manufacturer before repair: "+carReference.engine.manufacturer);
        Mechanic mechanic= new Mechanic();
        mechanic.repair(carReference);

        System.out.println("Engine manufacturer after repair: "+carReference.engine.manufacturer);

//        System.out.println("Initial name of car1 "+carReference.name);
//    carReference.name= "Audi";
//        System.out.println("Changed name of car1 "+carReference.name);
//
//        carReference= new Car();
//        System.out.println("Name of new car "+carReference.name);
//        carReference.name= "BMW";
//        carReference=car2;
//        System.out.println("Name of carReferenced from 2 variabiles Carreference "+carReference.name);
//        System.out.println("Name of carReferenced from 2 variabiles Car2 "+car2.name);
//
//        car2.name= "Dacia";
//
//        System.out.println("Updated name of carReferenced from 2 variabiles Carreference "+carReference.name);
//        System.out.println("Updated name of carReferenced from 2 variabiles Car2 "+car2.name);





    }
}



