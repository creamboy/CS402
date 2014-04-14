
public class Thing extends Object{
	protected String n;
	public Thing(String name){
		n=name;
	}
	public String toString(){
		String c=getClass().getSimpleName();
		if(c.equals("Thing")) return n;
		return n+" "+c;
		
	}
}
