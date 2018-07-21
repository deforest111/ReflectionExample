package com.WeiMin.ReflectionPractice;

public class Apple implements Farmer{
    @Override
    public String eatType() {
        System.out.println("Apple is delicious");
        //use reflection to get class info
        return  this.getClass().getSimpleName();
    }
}
