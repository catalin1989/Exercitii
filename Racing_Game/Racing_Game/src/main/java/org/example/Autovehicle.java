package org.example;

public class Autovehicle extends Vehicle {

    //"has-a" relationship (agregation)
    Engine engine;

    public  Autovehicle(Engine engine){
    this.engine=engine;
    }
}
