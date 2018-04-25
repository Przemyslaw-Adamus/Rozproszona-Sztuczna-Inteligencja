import jade.core.Agent;
import jade.core.behaviours.OneShotBehaviour;

public class klasa_2 extends Agent{
	
	protected void setup()
	{
		System.out.println("Startuje");
		addBehaviour(new BehaviourTest(this));
		
		System.out.println("Zaraz sie usune");
		//doDelete();
		
	}

}
class BehaviourTest extends OneShotBehaviour
{
	public BehaviourTest(Agent a) { 
        super(a);  
   }
	
	public void action()
	{
		System.out.println( "Hello World! My name is " + 
                myAgent.getLocalName() );
	}
	

}