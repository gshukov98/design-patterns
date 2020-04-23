package command.homework;

import command.Command;

public class MoveBackwardCommand implements Command {

	private Movements movements;
	
	public MoveBackwardCommand(Movements movements) {
		super();
		this.movements = movements;
	}
	
	@Override
	public void execute() {
		this.movements.moveBackward();
	}

}
