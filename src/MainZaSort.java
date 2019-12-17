import java.util.ArrayList;
import java.util.List;

public class MainZaSort {

	public static void main(String[] args) {
		
		List<Zaposleni> arraylist = new ArrayList<>();
		arraylist.add(new Zaposleni("Milivoje", "Radivojevic"));
		arraylist.add(new Zaposleni("Boris", "Ducic"));
		arraylist.add(new Zaposleni("Djordje", "Mitrovic"));
		arraylist.add(new Zaposleni("Vladislav", "Aksentijevic"));
		
		arraylist.sort(null);
		stampa(arraylist);
		
	}
	
	public static void stampa (List<Zaposleni> lista) {
		for (Zaposleni zaposleni : lista) {
			
			System.out.println(zaposleni.getPrezime());
		}
	}
}
