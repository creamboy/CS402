
public class TestCreature {
	public static int CREATURE_COUNT, THING_COUNT;
	public static void main(String[] args) {
		Creature[] c1=new Creature[CREATURE_COUNT];
		Thing[] t1=new Thing[THING_COUNT];
		for(int i=0;i<CREATURE_COUNT;i++){
			t1[i]=c1[i];
		}
		System.out.println("Things:");
		for(int i=0;i<THING_COUNT;i++){
			System.out.println(t1[i]);
		}
		System.out.println();
		System.out.println("Creature:");
		for(int i=0;i<THING_COUNT;i++){
			System.out.println(t1[i]);
		}
		System.out.println();
	}

}
