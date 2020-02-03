package fmi.informatics.greetings;

import fmi.informatics.events.Observable;

public class GreetingPerson implements Observer{

	private String name;
	private Observable observable;
	
	public GreetingPerson(String name, Observable observable) {
		super();
		this.name = name;
		this.observable = observable;
	}

	@Override
	public void update() {
		System.out.println("The GreeetingPerson with name" + this.name + "said \"Hello\" to " + observable.getClass().getName());
	}
	
//	public void unsubscribe() {
//		observable.removeObserver(this);
//	}
//	
//	public void makeAGreeting() {
//		
//	}
}
