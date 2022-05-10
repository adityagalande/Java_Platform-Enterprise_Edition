package rail.coach;
import com.wipro.automobile.ship.*;

public class TestCompartment {

	public static void main(String[] args) {
		FirstClass fs = new FirstClass();
		System.out.println(fs.notice());
		
		Ladies l = new Ladies();
		System.out.println(l.notice());
		
		Genral g = new Genral();
		System.out.println(g.notice());
		
		LuggageClass lc = new LuggageClass();
		System.out.println(lc.notice());
		
		com.wipro.automobile.ship.Compartment c = new com.wipro.automobile.ship.Compartment();
		c.height=10;
		c.width=20;
		c.breadth=30;
		System.out.println(c.height+"\n"+c.width+"\n"+c.breadth);
		

	}

}
