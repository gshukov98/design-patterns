package singleton;

public class SingletonMain {

	public static void main(String[] args) {

		Connection connection = Connection.getInstance();
		connection.sendData("Some test data");
	}

}
