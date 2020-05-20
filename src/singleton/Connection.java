package singleton; 

public class Connection {
	private static Connection instance;
	
	private Connection() {
		
	}
	
	public static Connection getInstance() {
		if(instance == null) {
			instance = new Connection();
		}
		
		return instance;
	}
	
	public void sendData(String data) {
		System.out.println("Sending data: " + data);
	}
}
