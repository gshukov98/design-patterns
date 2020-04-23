package command.homework;

import command.Command;

public class MoveForwardCommand implements Command {

	private Movements movements;
	
	public MoveForwardCommand(Movements movements) {
		super();
		this.movements = movements;
	}

	@Override
	public void execute() {
		this.movements.moveForward();

	}

}
