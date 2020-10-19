package com.company;

public class Fish extends Pet {
    int currentDepth = 0;
    public int dive(int howDeep){
        currentDepth = currentDepth + howDeep;
        if (currentDepth >100) {
            System.out.println("Я маленькая рыбка и не могу плавать глубже 100 метров");
            currentDepth = currentDepth - howDeep;
        }
        else
        {
        System.out.println("Ныряю на глубину " + howDeep + " футов");
        System.out.println("Я на глубие " + currentDepth + " футов ниже уровня моря");
    }
        return currentDepth;
    }

    @Override
    public String say(String something){
        String fishResponse = "Ты чё не знаешь, что рыбы не разговаривают?";
        System.out.println(fishResponse);
        return fishResponse;
    }
}
