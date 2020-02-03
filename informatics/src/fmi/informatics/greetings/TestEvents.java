package fmi.informatics.greetings;

import fmi.informatics.events.Observable;
import fmi.informatics.events.TV;
import fmi.informatics.events.User;

public abstract class TestEvents {

	public static void main(String[] args) {
		GreetedPerson greeted = new GreetedPerson();
		GreetingPerson greeting = new GreetingPerson("Pesho", (Observable) greeted);
		
		greeted.addObserver(greeting);
	}

}
