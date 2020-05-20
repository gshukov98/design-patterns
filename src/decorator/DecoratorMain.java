package decorator;

public class DecoratorMain {

	public static void main(String[] args) {
		Car lada = new Lada();
		lada.create();
		
		Car blueLada = new BlueCarDecorator(new Lada());
		blueLada.create();
		
		

	}

}
