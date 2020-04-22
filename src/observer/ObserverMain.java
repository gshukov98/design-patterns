package observer;

public class ObserverMain {

	public static void main(String[] args) {
		Topic topic = new Topic();
		
		Observer obs1 = new TopicSubscriber("Observer 1");
		Observer obs2 = new TopicSubscriber("Observer 2");
		Observer obs3 = new TopicSubscriber("Observer 3");
		
		topic.subscribe(obs1);
		topic.subscribe(obs2);
		topic.subscribe(obs3);
		
		topic.sertNewTopic("Breaking news! COVID 19");
		topic.sertNewTopic("New topic was set");

	}

}
