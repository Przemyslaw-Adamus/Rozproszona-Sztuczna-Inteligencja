import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;

public class klasa_3 extends Agent{
	
	protected void setup()
	{
		System.out.println("Startuje");
		addBehaviour(new CyclicBehaviour() {
			public void action()
			{
				System.out.println("powtarzajace sie zadanie");
			}
		});
		System.out.println("Zaraz sie usune");
		//doDelete();
	}
}
