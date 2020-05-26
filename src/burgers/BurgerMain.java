package burgers;

public class BurgerMain {

	public static void main(String[] args) {
		
		BurgerFacade burgerFacade = new BurgerFacade();
		
		burgerFacade.makeClassic();
		
		burgerFacade.makeWithCheese();
		
		burgerFacade.makeWithEgg();
	}

}
