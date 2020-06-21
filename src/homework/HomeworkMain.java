package homework;

import state.Context;
import state.State;

public class HomeworkMain {

	public static void main(String[] args) {
		Destination destination = new Destination();
		
		StateOfPreparation stateOfPreparation = new StateOfPreparation();
		
		Observer emp1 = new DestinationSubscriber("�������� - �������������");
		
		Context package1 = new Context("������ �� �������");
		Context package2 = new Context("������ �� ��������");
		Context package3 = new Context("�������� ������");
		
		stateOfPreparation.applyState(package1);
		stateOfPreparation.applyState(package2);
		stateOfPreparation.applyState(package3);
		
		State package1State = package1.getState();
		String current1State = package1State.getStateName();
		
		State package2State = package2.getState();
		String current2State = package2State.getStateName();
		
		State package3State = package3.getState();
		String current3State = package3State.getStateName();
		
		System.out.println("current1State: " + current1State);
		System.out.println("current2State: " + current2State);
		System.out.println("current3State: " + current3State);
		
		destination.subscribe(emp1);
		
		
		

	}

}
