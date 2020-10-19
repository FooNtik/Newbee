package com.company;

public class JamesBondCar extends Car{
    @Override
    public int drive(int supertime){
        int distance=supertime*180;
        System.out.println("Мы проехали " +distance +"км");
        return distance;
    }
}
