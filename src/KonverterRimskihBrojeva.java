import java.util.ArrayList;
import java.util.List;

public class KonverterRimskihBrojeva {

	public static void main(String[] args) {
		
//		prviRimskiKonverter(2011);
		drugiRimskiKonverter(2019);
		treciRimskiKonverter(2019);
		cetvrtiRimskiKonverter(2019);


	}
	
	public static void prviRimskiKonverter (int broj) {
		
		String rezultat = "";
		
		while (broj/1000 >=1) {
			rezultat+="M";
			broj -= 1000;
		}
		
		while (broj/900 >=1) {
			rezultat+="CM";
			broj -= 900;
		}
		
		while (broj/500 >=1) {
			rezultat+="D";
			broj -= 500;
		}
		//.........
		System.out.println(rezultat);
		
		
	}
	
	public static void drugiRimskiKonverter (int broj) {
		
		String rezultat = "";
		
		int[] arapski = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
		String[] rimski = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
		
		for (int i = 0; i < rimski.length; i++) {
			while(broj/arapski[i] >= 1) {
				rezultat += rimski[i];
				broj -= arapski[i];
			}
		}
		System.out.println("***************************");
		System.out.println("Konvertovanje rimskih brojeva pomocu dva niza");
		System.out.println("***************************");
		System.out.println(rezultat);
		
	}
	
	public static void treciRimskiKonverter (int broj) {
		String rezultat = "";
		
		int[] arapski = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
		List<String> rimskaLista = new ArrayList<String>();
		
		for (RimskiBroj rimskiEnum : RimskiBroj.values()) {
			rimskaLista.add(rimskiEnum.toString());
		}
		
		for (int i = 0; i < rimskaLista.size(); i++) {
			while(broj/arapski[i] >= 1) {
				rezultat += rimskaLista.get(i);
				broj -= arapski[i];
			}
		}
		
		System.out.println("***************************");
		System.out.println("Konvertovanje rimskih brojeva pomocu enumeracije i array liste");
		System.out.println("***************************");
		System.out.println(rezultat);
	}
	
	public static void cetvrtiRimskiKonverter (int broj) {
		String rezultat = "";
		
		int[] arapski = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
		
		List<String> rimskaLista = new ArrayList<String>();
		
		for (RimskiBroj rimskiEnum : RimskiBroj.values()) {
			rimskaLista.add(rimskiEnum.toString());
		}
		
		
		String[] rimskiNiz = new String[rimskaLista.size()];
		rimskiNiz = rimskaLista.toArray(rimskiNiz);
		
		
		for (int i = 0; i < rimskiNiz.length; i++) {
			while(broj/arapski[i] >= 1) {
				rezultat += rimskiNiz[i];
				broj -= arapski[i];
			}
		
		System.out.println("***************************");
		System.out.println("Konvertovanje rimskih brojeva pomocu enumeraccije i array liste koja je pretvorena u niz");
		System.out.println("***************************");
		System.out.println(rezultat);
	}
		
	}

}
