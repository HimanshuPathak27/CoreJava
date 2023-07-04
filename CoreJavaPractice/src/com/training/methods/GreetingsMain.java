package com.training.methods;

public class GreetingsMain {

	public static void main(String[] args) {
		Greetings greet = new Greetings();
		
		//Calling Method with No parameter and No return value
		greet.greetingForDay();
		
		//Calling Method with No parameter but returns a value
		String greetMessage1 = greet.greetingForNoon();
		System.out.println(greetMessage1);
		
		//Calling Method with parameter and No return value
		greet.greetingForEvening("Good Evening !!");
		
		//Calling Method with parameter and return value
		String greetMessage2 = greet.greetingForNight("Sleep Well");
		System.out.println(greetMessage2);
	}

}
