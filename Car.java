package com.company;

public class Car {
    int distance=0;
    public void start(){
        System.out.println("Пгнали!");
    }
    public void stop(){
        System.out.println("Стояночка!!!");
    }
    public int drive(int howlong){
        distance=howlong*60;
        System.out.println(distance);
        return distance;
    }

}
