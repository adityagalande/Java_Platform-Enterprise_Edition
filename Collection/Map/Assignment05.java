import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

class Country {
	private TreeMap<String, String> M1;
	
	public Country() {
		M1 = new TreeMap<String, String>();
	}
	
	public TreeMap<String, String> saveCountryCapital(String CountryName, String capital) {
		M1.put(CountryName, capital);
		return M1;
	}
	
	public String getCapital(String CountryName) {
		return M1.get(CountryName);
	}
	
	public String getCountry(String capitalName) {
		Set<Entry<String, String>> set = M1.entrySet();
		Iterator<Entry<String, String>> itr = set.iterator();
		
		while (itr.hasNext()) {
			Entry<String, String> e = itr.next();
			
			if (e.getValue().equals(capitalName))
				return e.getKey();
		}
		return null;
	}
	
	public TreeMap<String, String> swapKyeValue() {
		TreeMap<String, String> M2 = new TreeMap<String, String>();
		
		Set<Entry<String, String>> set = M1.entrySet();
		Iterator<Entry<String, String>> itr = set.iterator();
		
		while (itr.hasNext()) {
			Entry<String, String> e = itr.next();
			M2.put(e.getValue(), e.getKey());
		}
		
		return M2;
	}
	
	public ArrayList<String> toArrayList() {
		ArrayList<String> list = new ArrayList<>();
		
		Set<Entry<String, String>> set = M1.entrySet();
		Iterator<Entry<String, String>> itr = set.iterator();
		
		while (itr.hasNext()) {
			Entry<String, String> e = itr.next();
			list.add(e.getKey());
		}
		return list;
	}
}

public class Assignment05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Country country = new Country();

		country.saveCountryCapital("India", "Delhi");
		country.saveCountryCapital("Japan", "Tokyo");
		country.saveCountryCapital("USA", "Washington, D.C.");
		
		System.out.println(country.getCapital("India"));
		System.out.println(country.getCountry("Tokyo"));
		System.out.println(country.toArrayList());
		
		TreeMap<String, String> M2 = country.swapKyeValue();
		System.out.println(M2);
	}

}
