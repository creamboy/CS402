
public class TestCreature {
	public static int CREATURE_COUNT, THING_COUNT;
	public static void main(String[] args) {
		CREATURE_COUNT=4;
		THING_COUNT=6;
		Creature[] c1=new Creature[CREATURE_COUNT];
		Thing[] t1=new Thing[THING_COUNT];
		c1[0]=new Tiger("Tony");
		c1[1]=new Fly("Jeff Goldblum");
		c1[2]=new Ant("Jimmy");
		c1[3]=new Bat("Batman");
		t1[0]=new Thing("blueberry");
		t1[1]=new Tiger("Tony");
		t1[2]=new Thing("zircon-encrusted tweezers");
		t1[3]=new Fly("Jeff Goldblum");
		t1[4]=new Ant("Jimmy");
		t1[5]=new Bat("Batman");
	
		System.out.println("Things:");
		for(int i=0;i<THING_COUNT;i++){
			System.out.println(t1[i]);
		}
		System.out.println();
		System.out.println("Creature:");
		for(int i=0;i<CREATURE_COUNT;i++){
			System.out.println(c1[i]);
		}
		System.out.println();
		System.out.println("Creature moves:");
		for(int i=0;i<CREATURE_COUNT;i++){
			c1[i].move();
		}
		System.out.println();
		System.out.println("Creature eats:");
		for(int i=0;i<CREATURE_COUNT;i++){
			c1[i].eat(new Ant("a Ant"));
		}
		System.out.println();
		System.out.println("Creature what did you eat:");
		for(int i=0;i<CREATURE_COUNT;i++){
			c1[i].whatDidYouEat();
		}
		System.out.println();
		
	}

}
