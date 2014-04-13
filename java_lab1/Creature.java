
public abstract class Creature extends Thing{
	protected Thing lasteat;
	public Creature(String name) {
		super(name);
		lasteat=null;
	}
	public void eat(Thing aThing){
		lasteat=aThing;
		System.out.println("{"+super.toString()+"} has just eaten a {"+aThing+"}. ");
	}
	public abstract void move();
	public void whatDidYouEat(){
		if(lasteat==null)
			System.out.println("{"+super.n+"}{"+super.getClass().getSimpleName()+"} has had nothing to eat! ");
		else{
			System.out.println("{"+super.n+"}{"+super.getClass().getSimpleName()+"} has eaten a {"+lasteat+"}! ");
		}
	}
}
