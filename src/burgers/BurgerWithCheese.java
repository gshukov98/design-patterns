package burgers;

public class BurgerWithCheese extends BurgerDecorator {

	public BurgerWithCheese(Burger decoratedBurger) {
		super(decoratedBurger);
	}
	
	public void create() {
		
		decoratedBurger.create();
		setBurgerCheese(decoratedBurger);
		
	}
	
	private void setBurgerCheese(Burger decoratedBurger) {
		System.out.println("Add cheese to the burger!");
	}
}
