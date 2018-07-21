package com.WeiMin.ReflectionPractice;

public class Pinapple implements Farmer{
	  @Override
	    public String eatType() {
	        System.out.println("Pinapple is delicious");
	        //use reflection to get class info
	        return  this.getClass().getSimpleName();
	    }

}
