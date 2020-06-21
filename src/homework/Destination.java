package homework;

import java.util.ArrayList;
import java.util.List;

import homework.Observerable;
import homework.Observer;

public class Destination implements Observerable{

	private List<Observer> subscribers;
	private String destination;
	
	public Destination() {
		this.subscribers = new ArrayList<Observer>();
	}

	@Override
	public void notifyObservers() {
		for(Observer observer : this.subscribers) {
			observer.update();
		}
	}

	@Override
	public String getUpdate() {
		return this.destination;
	}
	
	public void sentNewTopic(String newDestination) {
		this.destination = newDestination;
		this.notifyObservers();
	}

	@Override
	public void subscribe(Observer observer) {
		this.subscribers.add(observer);
		observer.setDestination(this);
		
	}

	@Override
	public void unsubscribe(Observer observer) {
		this.subscribers.remove(observer);
	}

}
