
public class Fly extends Creature  implements Flyer{

	public Fly(String name) {
		super(name);
	}

	@Override
	public void move() {
		fly();
	}
	public void eat(Thing aThing) {
		System.out.println("{"+super.n+"}{"+super.getClass().getSimpleName()+"} won't eat {"+aThing+"}");
	}
	public void fly() {
		System.out.println("{"+super.n+"}{"+super.getClass().getSimpleName()+"} is buzzing around in flight. ");

	}
}
