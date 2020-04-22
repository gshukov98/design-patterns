package observer;

public class TopicSubscriber implements Observer {
	
	private Observerable topic;
	private String name;

	public TopicSubscriber(String name) {
		this.name = name;
	}

	@Override
	public void update() {
		if(this.topic == null) {
			System.out.println("No topic set");
			return;
		}
		
		String newTopic = topic.getUpdate();
		System.out.println(this.name + " received: " + newTopic);

	}

	@Override
	public void setTopic(Observerable topic) {
		this.topic = topic;

	}

}
