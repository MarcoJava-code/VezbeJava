package komparacije;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MainZaKomparacije {

	public static void main(String[] args) {

		List<Radnik> linkedList = new LinkedList<>();
		linkedList.add(new Radnik("Marko Vasic", "zidar", 76000.00, "123"));
		linkedList.add(new Radnik("Veljko Potparic", "vozac", 54000.00, "434"));
		linkedList.add(new Radnik("Petar Jankovic", "limar", 59000.00, "634"));
		linkedList.add(new Radnik("Davor Manojlovic", "zidar", 63000.00, "545"));
		linkedList.add(new Radnik("Marko Petrovic", "zidar", 63000.00, "545"));
		linkedList.add(new Radnik("Marko Ignjatovic", "zidar", 63000.00, "545"));
		linkedList.add(new Radnik("Davor Stefanovic", "zidar", 63000.00, "545"));

		System.out.println("********************************");
		System.out.println("Stampa bez sortiranja");
		System.out.println("********************************");

		for (Radnik radnik : linkedList) {
			System.out.println(radnik);
		}

		// sortiranje po plati
		linkedList.sort(new RadnikPlataSort());

		System.out.println("********************************");
		System.out.println("Stampa sortirana po plati");
		System.out.println("********************************");

		for (Radnik radnik : linkedList) {
			System.out.println(radnik);
		}

		// sortiranje po imenu
		linkedList.sort(new RadnikImeSort());

		System.out.println("********************************");
		System.out.println("Stampa sortirana po imenu radnika");
		System.out.println("********************************");

		for (Radnik radnik : linkedList) {
			System.out.println(radnik);
		}

		System.out.println("********************************");
		System.out.println("Stampa sortirana po prezimenu radnika");
		System.out.println("********************************");

		linkedList.sort(new RadnikPrezimeSort());
		
		stampaPrezimena(linkedList);

		System.out.println("********************************");
		System.out.println("Stampa sortirana po broju racuna radnika");
		System.out.println("********************************");

		linkedList.sort(new RacunSort());
		for (Radnik radnik : linkedList) {
			System.out.println(radnik);
		}
		System.out.println("********************************");
		System.out.println("Stampa sortirana po ...");
		System.out.println("********************************");
		
		Radnik peraMikic = new Radnik("Pera Mikic", "programer", 100000.00, "53435633");
		
//		getRadnik (linkedList, "Marko");
		dodajRadnika(linkedList, new Radnik("Predrag Markovic", "tesar", 44000.00, "333"));
		dodajRadnika(linkedList, peraMikic);
		for (Radnik radnik : linkedList) {
			System.out.println(radnik);
		}
		
		List<Radnik> novaRadnikLista = new ArrayList<Radnik>();
		dodajRadnika(novaRadnikLista, peraMikic);
		
		
		System.out.println("********************************");
		System.out.println("NOVA RADNIK LISTA");
		System.out.println("********************************");
		for (Radnik radnik : novaRadnikLista) {
			System.out.println(radnik);
		}
		
		System.out.println("********************************");
		System.out.println("STAMPA FILTRIRANE LISTE PO OSNOVU IMENA");
		System.out.println("********************************");
		
		List<Radnik> filtriranaLista = getRadnik(linkedList, "Marko");
		
		filtriranaLista.forEach(element->System.out.println(element.getImeIPrezime()));
		
		
	}
	
	public static void stampaPrezimena (List<Radnik> listaRadnika) {
		listaRadnika.forEach(radnik->{
			String prezime = radnik.getImeIPrezime().substring(radnik.getImeIPrezime().lastIndexOf(" "));
			System.out.println(prezime);
		});
	
	}
			
	public static List<Radnik> getRadnik (List<Radnik> listaRadnika, String ime) {
		
			List<Radnik> novaLista = new ArrayList<Radnik>();
		
			for (Radnik radnik : listaRadnika) {
				if(radnik.getImeIPrezime().startsWith(ime)) {
					novaLista.add(radnik);
			}
			
		}
		if(novaLista.size() == 0) {
			System.out.println("U firmi nema radnika sa imenom " + ime);
		}
		return novaLista;
	}

	
	
	public static void dodajRadnika(List<Radnik> lista, Radnik radnik) {
		lista.add(radnik);
	}
	
}
