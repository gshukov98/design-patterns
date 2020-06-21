package homework;

public class DestinationSubscriber implements Observer{

	private Observerable destination;
	private String name;
	
	public DestinationSubscriber(String name) {
		this.name = name;
	}

	@Override
	public void update() {
		if(this.destination == null) {
			System.out.println("No topic set");
			return;
		}
		
		String newDestination = destination.getUpdate();
		System.out.println(this.name + " received: " + newDestination);
		
	}

	@Override
	public void setDestination(Observerable destination) {
		this.destination = destination;
		
	}
}
