package rail.coach;

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

	}

}
