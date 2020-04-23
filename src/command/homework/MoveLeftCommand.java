package command.homework;

import command.Command;

public class MoveLeftCommand implements Command{

	private Movements movements;
	
	public MoveLeftCommand(Movements movements) {
		super();
		this.movements = movements;
	}
	
	@Override
	public void execute() {
		this.movements.moveLeft();
		
	}

}
