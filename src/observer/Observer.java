package observer;

public interface Observer {

	public void update();
	public void setTopic(Observerable topic);
}
