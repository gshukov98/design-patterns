package burgers;

public class BurgerFacade {
	private Burger classic;
	private Burger withCheese;
	private Burger withEgg;
	
	public BurgerFacade() {
		this.classic = new BurgerImpl();
		this.withCheese = new BurgerWithCheese(new BurgerImpl());
		this.withEgg = new BurgerWithEgg(new BurgerImpl());

	}
	
	public void makeClassic() {
		classic.create();
	}
	
	public void makeWithCheese() {
		withCheese.create();
	}
	
	public void makeWithEgg() {
		withEgg.create();
	}

}
