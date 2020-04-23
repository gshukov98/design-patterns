package command.homework;

import command.Command;

public class MoveRightCommand implements Command {

	private Movements movements;
	
	public MoveRightCommand(Movements movements) {
		super();
		this.movements = movements;
	}
	
	@Override
	public void execute() {
		this.movements.moveRight();

	}

}
