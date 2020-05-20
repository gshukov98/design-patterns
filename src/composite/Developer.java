package composite;

public class Developer implements Employee {
	
	private String name;
	private double salary;

	public Developer(String name,double salary) {
		this.name = name;
		this.salary = salary;
	}
	
	@Override
	public void add(Employee employee) {
		// Leaf can't add emp

	}

	@Override
	public void remove(Employee employee) {
		// Leaf can't remove emp

	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public double getSalary() {
		return this.salary;
	}

	@Override
	public void printData() {
		System.out.println("===> Developer: " + this.getName() + " > " + this.getSalary());
	}

}
