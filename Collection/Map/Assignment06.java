import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

class CountryTable {
	private Hashtable<String, String> M1;
	
	public CountryTable() {
		M1 = new Hashtable<String, String>();
	}
	
	public Hashtable<String, String> saveCountryCapital(String CountryName, String capital) {
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
	
	public Hashtable<String, String> swapKyeValue() {
		Hashtable<String, String> M2 = new Hashtable<String, String>();
		
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

public class Assignment06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountryTable countryTable = new CountryTable();

		countryTable.saveCountryCapital("India", "Delhi");
		countryTable.saveCountryCapital("Japan", "Tokyo");
		countryTable.saveCountryCapital("USA", "Washington, D.C.");
		
		System.out.println(countryTable.getCapital("India"));
		System.out.println(countryTable.getCountry("Tokyo"));
		System.out.println(countryTable.toArrayList());
		
		Hashtable<String, String> M2 = countryTable.swapKyeValue();
		System.out.println(M2);
	}

}
