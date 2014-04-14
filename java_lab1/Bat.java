
public class Bat extends Creature implements Flyer{

	public Bat(String name) {
		super(name);
	}

	@Override
	public void move() {
		fly();
	}
	public void eat(Thing aThing) {
		if(aThing.getClass().getSimpleName()=="Thing")
			System.out.println("{"+super.n+"}{"+super.getClass().getSimpleName()+"} won't eat {"+aThing+"}");
		else{
			super.eat(aThing);
		}
			
	}
	public void fly() {
		System.out.println("{"+super.n+"}{"+super.getClass().getSimpleName()+"} is swooping through the dark.");

	}

}
