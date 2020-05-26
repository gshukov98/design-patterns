package burgers;

public class BurgerWithEgg extends BurgerDecorator {

	public BurgerWithEgg(Burger decoratedBurger) {
		super(decoratedBurger);
	}
	
	public void create() {
		
		decoratedBurger.create();
		setBurgerCheese(decoratedBurger);
		
	}
	
	private void setBurgerCheese(Burger decoratedBurger) {
		System.out.println("Add egg to the burger!");
	}
}
