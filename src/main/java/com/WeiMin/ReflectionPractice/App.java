package com.WeiMin.ReflectionPractice;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
		Farmer A = EatFruit.wannaToEat("Apple");
		Farmer P = EatFruit.wannaToEat("Pinapple");
		System.out.println(A.eatType());
		System.out.println(P.eatType());
    }
}
