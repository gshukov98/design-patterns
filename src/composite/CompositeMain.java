package composite;

public class CompositeMain {

	public static void main(String[] args) {
		
		Developer dev1 = new Developer("Ivan", 1500);
		Developer dev2 = new Developer("Petkan", 2000);
		
		Manager manager1 = new Manager("Stamat", 4000);
		
		manager1.add(dev1);
		manager1.add(dev2);
		
		Developer dev3 = new Developer("Hristo", 4500);
		
		Manager bashManager = new Manager("Joro", 6000);
		
		bashManager.add(manager1);
		bashManager.add(dev3);
		
		bashManager.printData();

	}

}
