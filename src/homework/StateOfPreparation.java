package homework;

import state.Context;
import state.State;

public class StateOfPreparation  implements State {
	
	private String stateName = "PREPARATION_STATE";

	@Override
	public void applyState(Context context) {
		context.setState(this);
	}

	@Override
	public String getStateName() {
		return this.stateName;
	}

}
