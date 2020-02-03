package fmi.informatics.greetings;

import java.util.ArrayList;
import java.util.List;

public class GreetedPerson implements Observable{
	private List<Observer> people = new ArrayList<>();
	private boolean wasGreetByAnotherOne;

	@Override
	public void addObserver(Observer o) {
		people.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		people.remove(o);
	}

	@Override
	public void notifyObserver() {
		
	}

	public boolean isGreetAnotherOne() {
		return wasGreetByAnotherOne;
	}

	public void setGreetAnotherOne(boolean greetAnotherOne) {
		this.wasGreetByAnotherOne = greetAnotherOne;
	}

}
