import jade.core.Agent;
import jade.core.behaviours.TickerBehaviour;
public class klasa_8 extends Agent{
	
	protected void setup()
	{
		System.out.println("Start ");
		
		
		addBehaviour(new TickerBehaviour(this, 2000) {
			 protected void onTick() {
			 		System.out.println("Maly tick");
			 	}
			 } );
		Podpunkt_b test = new Podpunkt_b(this,5000);
		addBehaviour(test);
		
		addBehaviour(new TickerBehaviour(this,50000)
				{
					protected void onTick()
					{
						removeBehaviour(test);
					}
				});
		
		addBehaviour(new TickerBehaviour(this,100000)
				{
					protected void onTick()
					{
						System.out.println("Konec agenta!");
						doDelete();
					}
				});
		System.out.println("Koniec ");
	}

}

class Podpunkt_b extends TickerBehaviour
{
	public Podpunkt_b(Agent a, long period) {
		super(a, period);
	}

	protected void onTick()
	{
		System.out.println("Duzy tick");
	}
}