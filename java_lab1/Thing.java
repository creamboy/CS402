
public class Thing extends Object{
	protected String n;
	public Thing(String name){
		n=name;
	}
	public String toString(){
		return getClass().getSimpleName()+" "+n;
		
	}
}
