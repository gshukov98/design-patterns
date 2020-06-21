package homework;
import homework.Observer;

public interface Observerable {
	
	public void subscribe(Observer observer);
	//public void unsubscribe(Observer observer);
	public void notifyObservers();
	public String getUpdate();
	void unsubscribe(homework.Observer observer);

}
