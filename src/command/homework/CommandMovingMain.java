package command.homework;

import command.Command;
import command.RemoteController;

public class CommandMovingMain {

	public static void main(String[] args) {
		RemoteController remoteController = new RemoteController();
		Movements movements = new Movements();
		
		Command moveForwardCommand = new MoveForwardCommand(movements);
		Command moveBackwardCommand = new MoveBackwardCommand(movements);
		Command moveLeftCommand = new MoveLeftCommand(movements);
		Command moveRightCommand = new MoveRightCommand(movements);
		
		remoteController.setCommand(moveForwardCommand);
		remoteController.pressButton();
		
		remoteController.setCommand(moveForwardCommand);
		remoteController.pressButton();
		
		remoteController.setCommand(moveBackwardCommand);
		remoteController.pressButton();
		
		remoteController.setCommand(moveLeftCommand);
		remoteController.pressButton();
		
		remoteController.setCommand(moveLeftCommand);
		remoteController.pressButton();
		
		remoteController.setCommand(moveRightCommand);
		remoteController.pressButton();
		
		
	}

}
