
public class Tiger extends Creature {

	public Tiger(String name) {
		super(name);
	}

	@Override
	public void move() {
		System.out.println("{"+super.n+"}{"+super.getClass().getSimpleName()+"} has just pounced. ");
	}

}
