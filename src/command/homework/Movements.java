package command.homework;

public class Movements {
	
	private int positionX = 0;
	private int positionY = 0;
	
	public void moveForward() {
		System.out.println("Moving forward.");
		this.positionX += 1;
		PositionPrint();
	}
	
	public void moveBackward() {
		System.out.println("Moving backward.");
		this.positionX -= 1;
		PositionPrint();
	}
	
	public void moveLeft() {
		System.out.println("Moving left.");
		this.positionY -= 1;
		PositionPrint();
	}
	
	public void moveRight() {
		System.out.println("Moving right.");
		this.positionY += 1;
		PositionPrint();
	}
	
	private void PositionPrint() {
		System.out.printf("PositionX:%d PositionY:%d\n",positionX,positionY);
		System.out.println("-----------------");
	}

}
