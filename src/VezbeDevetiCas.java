import java.text.DecimalFormat;
import java.util.Scanner;

public class VezbeDevetiCas {
	
	
	public static Scanner sc = new Scanner(System.in);
	
	

	public static void main(String[] args) {
		
		try {
			unosOcena();
		} catch (Exception e) {
			System.out.println("Nema unesenih ocena");
		}


	}
	
	
	public static void unosOcena () throws Exception {
		System.out.println("Koliko zelite da unesete ocena (maksimalan unos je 10 ocena): ");
		int duzinaNiza = sc.nextInt();
		
		if(duzinaNiza >10) {
			duzinaNiza = 10;
		} else if(duzinaNiza<1) {
			duzinaNiza = 0;
			throw new Exception("Nema unesenih ocena");
		}
		
		
		int[] nizOcena = new int[duzinaNiza];
		
		System.out.println("Odabran je unos " + duzinaNiza + " ocena.");
		
		double suma = 0.0;
		double prosek = 0.0;
		
		//Napravili smo for petlju da bismo svakom elementu u nizu dodali vrednost (ocenu)
		
		for (int i = 0; i < nizOcena.length; i++) {
			nizOcena[i] = unosJedneOcene(i+1);
			suma += nizOcena[i];
		}
		
		prosek = suma/nizOcena.length;
		
		String rezultatProseka = dveDecimale(prosek);
		
		System.out.println("Prosek unesenih ocena je: " + rezultatProseka);
		
	}
	
	
	public static int unosJedneOcene (int redniBrojOcene) {
		System.out.println("Unesite " + redniBrojOcene + ". ocenu: ");
		int ocena = sc.nextInt();	
		if(ocena<1 || ocena>5) {
			System.out.println("Ocena mora biti u opsegu od 1 do 5: ");
			ocena = unosJedneOcene(redniBrojOcene);
		}
		return ocena;
	}
	
	
	public static String dveDecimale(double prosek) {
		DecimalFormat df = new DecimalFormat("#.##");
		String dveDecimale = df.format(prosek);
		return dveDecimale;
	}

}
