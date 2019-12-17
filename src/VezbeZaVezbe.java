import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class VezbeZaVezbe {

	public static void licniPodaci(String imeIPrezime) {

		String[] podela = imeIPrezime.split(" ");
		String ime = podela[0];
		String prezime = podela[1];
//		char[] charNiz = new char[ime.length()];
//		for (String string : podela) {
//			System.out.println(string);
//		}

		String[] brojSlovaImena = ime.split("");
		for (String string : brojSlovaImena) {
//			System.out.println(string);
		}
		String[] brojSlovaPrezimena = prezime.split("");
		for (String string : brojSlovaPrezimena) {
//			System.out.println(string);
		}

//		for(int i=0;i<ime.length();i++) {
//			charNiz[i] = ime.charAt(i); 
//			System.out.println(charNiz[i]);
//		}

		System.out.println(brojSlovaImena[0].toUpperCase());
		System.out.println(brojSlovaPrezimena[0].toUpperCase());
		System.out.println(brojSlovaImena[2].toLowerCase());
		System.out.println(brojSlovaPrezimena[3].toLowerCase());
		System.out.println(ime.length());
		System.out.println(prezime.length());
		System.out.println("------------------------------------------");
//	
	}

	public static void kojiJeNajmanji(int... niz) {

		int najmanji = niz[0];
		for (int i = 1; i < niz.length; i++) {
			if (niz[i] < najmanji) {
				najmanji = niz[i];
			}
		}
		System.out.println(najmanji);
	}

	public static void kojiJeNajveci(int... niz) {

		int najveci = niz[0];
		for (int i = 1; i < niz.length; i++) {
			if (niz[i] > najveci) {
				najveci = niz[i];
			}
		}
		System.out.println(najveci);
	}

	public static void nizOdNajmanjeg(int... niz) {

//		int[] noviNiz = new int[niz.length];

		int x = 0;

		for (int i = 0; i < niz.length; i++) {
			for (int j = niz.length - 1; j > i; j--) {
				if (niz[i] > niz[j]) {
					x = niz[i];
					niz[i] = niz[j];
					niz[j] = x;
				}
			}

//		for(int i=0;i<niz.length;i++) {
//			for(int j=0;j<niz.length;j++) {
//				if(noviNiz[j]<noviNiz[i]) {
//					
//					noviNiz[i] = noviNiz[j];
//	
//				}
//			}

		}

		for (int i : niz) {
			System.out.println(i);
		}

	}

	public static void palindromRec(String rec) {
		
//		String[] novaRec = rec.split("");
//		String [] obrnutaRec = new String[rec.length()];
//		
//		for (int i = obrnutaRec.length-1; i >0 ; i--) {
//			
//		}

		String reverse = "";
		
		for (int i = rec.length()-1; i >= 0; i--) {
			reverse = reverse + rec.charAt(i);
		}
		
		if(rec.equals(reverse)) {
			System.out.println("Rect " + rec + " je palindrom.");
		} else {
			System.out.println("Rect " + rec + " nije palindrom.");
		}
		
	}
	
	public static boolean jeLiPalindrom(String rec) {
		
		char[] karakter = rec.toCharArray();
		
		for (int i = 0, j=karakter.length-1; i < j; i++, j--) {
			if(karakter[i] != karakter[j]) {
				return false;
			}
		}
		return true;
		
	}

//	public static void najmanjiINajveci (int...niz) {
//		int min = niz[0];
//		int max = niz[0];
//		
//		for (int i = 1; i < niz.length; i++) {
//			if(niz[i]<min) {	
//				min=niz[i];
//			}
//			if(max<niz[i]) {
//				max=niz[i];
//			}
//		}
//		System.out.println("Najmanji broj u nizu je: " + min);
//		System.out.println("Najveci broj u nizu je: " + max);
//	}
	
	public static void Menjacnica() {
		
		
	
		System.out.println("Unesite zeljenu valutu ili pritisnite q za izlaz: ");
		Scanner sc = new Scanner(System.in);
		String valuta = sc.nextLine();
		double rezultat = 0 ;
		double iznos = 0.0;
		
		switch (valuta) {
		case "evro":
			System.out.println("Unesite zeljeni iznos u evrima ");
			iznos = sc.nextDouble();
			rezultat = iznos * 120;
			System.out.println("Za iznos od " + iznos + " evra, dobicete " + rezultat + " dinara.");
			sc.close();
			break;
		case "dinar":
			System.out.println("Unesite zeljeni iznos u dinarima ");
			iznos = sc.nextDouble();
			rezultat = iznos/120;
			System.out.println("Za iznos od " + iznos + " dinara, dobicete " + rezultat + " evra.");
			sc.close();
		case "q":
			System.out.println("Ponistili ste transakciju.");
			break;
		default:
			System.out.println("Niste uneli pravu valutu, ponovite postupak.");
			Menjacnica();
			break;
		}

	}
		
		
	public static void kolikoImaSlova (char karakter, String rec) {
		
		int brojSlova = 0;
		for(int i=0;i<rec.length();i++) {
			if(rec.toLowerCase().charAt(i) == karakter || rec.toUpperCase().charAt(i) == karakter) {
				brojSlova++;
			}
		}
		System.out.println("Rec " + rec + " ima " + brojSlova + " slova " + karakter);

	}

	

	public static void main(String[] args) {

//		licniPodaci("Marko Vasic");
//		System.out.println("------------------------------------------");
//		palindromRec("anavolimilovana");
//		Menjacnica();
//		nizOdNajmanjeg(32, 664, 22, 145, -15);
		
		char karakter = 'a';
		String rec = "Anagram";
		 
		kolikoImaSlova(karakter,rec);
//		kolikoImaSlova((char) 0,"anagram");
		
//		palindromRec("programiranje");
		
//		String oko = "oko";
//		
//		if (jeLiPalindrom(oko)) {
//			System.out.println("Rec " + oko + " je palindrom.");
//		} else {
//			System.out.println("Nije palindrom.");
//		}
//		
		

//		kojiJeNajmanji(32,664,22,145,-15);
//		kojiJeNajveci(32,664,22,145,-15);

	}
}

//		najmanjiINajveci(32,664,22,145,-15);

//		palindrom("oko");
//		
//	}
//	
//	public static void palindrom (String rec) {
//		String rezultat ="";
//		StringBuffer sbuffer = new StringBuffer(rec).reverse();
//		StringBuilder sbuilder = new StringBuilder(rec).reverse();
//	
//		
//		String novaRec = sbuffer.toString();
//		
//		if(rec.equals(novaRec)) {
//			System.out.println("Rec " + rec + " je palindrom");
//		} else {
//			System.out.println("Rec " + rec + " nije palindrom");
//		}
//	}
//	
