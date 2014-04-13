
public class Ant extends Creature {

	public Ant(String name) {
		super(name);
	}

	@Override
	public void move() {
		System.out.println("{"+super.n+"}{"+super.getClass().getSimpleName()+"} is crawling around. ");

	}

}
