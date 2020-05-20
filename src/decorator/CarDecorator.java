package decorator;

public abstract class CarDecorator implements Car {

	protected Car decoratedCar;
	
	public CarDecorator(Car decoratedCar) {
		this.decoratedCar = decoratedCar;
	}

	@Override
	public void create() {
		//
		//
		//
		// and smth special to the basic car model
		//......
		
		this.decoratedCar.create();

	}

}
