import static org.junit.Assert.*;

import org.junit.Test;


public class ThingTest {
	Thing s1=new Thing("bluberry");
	@Test
	public void testtoSring() {
		String name=s1.toString();
		assertEquals(name,"bluberry");
	}

}
