import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;



public class MainZaDrzave {

	public static void main(String[] args) {
		
		Map<Integer, DrzaveIGradovi> hashMap = new HashMap<Integer, DrzaveIGradovi>();
		
		hashMap.put(1, new DrzaveIGradovi("Engleska", "London"));
		hashMap.put(2, new DrzaveIGradovi("Srbija", "Beograd"));
		hashMap.put(3, new DrzaveIGradovi("SLovenija", "Ljubljana"));
		hashMap.put(4, new DrzaveIGradovi("Spanija", "Madrid"));
		hashMap.put(5, new DrzaveIGradovi("Francuska", "Pariz"));
		hashMap.put(3, new DrzaveIGradovi("Francuska", "Pariz"));
		
		List<String> noviGlavniGradovi = new ArrayList<String>();
		
//		Map <String, String> drzavaGlavniGrad = new HashMap<String, String>();
//		drzavaGlavniGrad.put("Srbija", "Beograd");
//		drzavaGlavniGrad.put("SLovenija", "Ljubljana");
//		drzavaGlavniGrad.put("Spanija", "Madrid");
//		drzavaGlavniGrad.put("Francuska", "Pariz");
//		
//		getGradIzDrzave(hashMap, "Engleska");
//		getGradIzDrzave(hashMap, "Mauritanija");
//		getDrzava(hashMap, "Budimpesta");
		
		ubaciUListuAkoJeGlavniGrad(hashMap, noviGlavniGradovi, "Tokio");
		
		odstampajListuGlavnihGradova(noviGlavniGradovi);

	}

	
	public static void getGradIzDrzave(Map<Integer, DrzaveIGradovi> mapa, String drzava) {
		
		String grad = null;

		Set<Map.Entry<Integer, DrzaveIGradovi>> setMap = new HashSet<>(mapa.entrySet());
		for (Entry<Integer, DrzaveIGradovi> entry : setMap) {
			if (drzava.equals(entry.getValue().getDrzava())) {
				grad = entry.getValue().getGrad();
			}
		}
		if (grad != null) {
			System.out.println("Glavni grad drzave " + drzava + " je " + grad);
		} else {
			System.out.println("Nemamo podatak koji je glavni grad drzave " + drzava + ".");
		}

	}

	public static void getDrzava(Map<Integer, DrzaveIGradovi> mapa, String grad) {
		
		String drzava = null;
		Set<Map.Entry<Integer, DrzaveIGradovi>> setMap = new HashSet<>(mapa.entrySet());

		for (Entry<Integer, DrzaveIGradovi> entry : setMap) {
			if (grad.equals(entry.getValue().getGrad())) {
				drzava = entry.getValue().getDrzava();
			}

		}if (drzava != null) {
			System.out.println(grad + " je glavni grad drzave " + drzava);
		}else {
			System.out.println("Nemamo podatak koje drzave je glavni grad " + grad + ".");
		}

	}
	
	public static String daLiJeGlavniGrad(Map<Integer, DrzaveIGradovi> mapa, String grad) {
		
		boolean test = false;

		Set<Map.Entry<Integer, DrzaveIGradovi>> setMap = new HashSet<>(mapa.entrySet());
		for (Entry<Integer, DrzaveIGradovi> entry : setMap) {
			if (grad.equals(entry.getValue().getGrad())) {
				test = true;
			}
		}
		if (test) {
			return grad;
		} else {
			return null;
		}
	}
	
	public static void ubaciUListuAkoJeGlavniGrad (Map<Integer, DrzaveIGradovi> mapa,List<String> glavniGradovi, String grad) {
		// ubaci grad u listu ako je taj grad glavni grad
		
		Set<Map.Entry<Integer, DrzaveIGradovi>> setMap = new HashSet<>(mapa.entrySet());
		boolean test = false;
		
		for (Entry<Integer, DrzaveIGradovi> entry : setMap) {
			if(grad == (entry.getValue().getGrad())) {
				test = true;
				break;
			}
		}
		
		if(!test) {
			glavniGradovi.add(grad);
		}	
	}
	
	public static void odstampajListuGlavnihGradova (List<String> glavniGradovi) {
		// odstampaj listu pomocu lambda izraza
		glavniGradovi.forEach(System.out::println);
	}

}	

