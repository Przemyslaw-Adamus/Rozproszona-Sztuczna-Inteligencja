import jade.core.Agent;
import jade.core.behaviours.Behaviour;

public class klasa_1 extends Agent{
	
	protected void setup()
	{
		System.out.println("Startuje");
		System.out.println("Zaraz sie usune");
		doDelete();
	}

}

