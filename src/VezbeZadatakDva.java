import java.util.Scanner;

public class VezbeZadatakDva {

	public static void main(String[] args) throws Exception {
		
//		pretvaranjeVrednosti();
		ocene();
	}
	
	
	
	
	public static void pretvaranjeVrednosti() throws Exception {
		
		System.out.println("Unesite zeljenu vrednost ili izlaz za izlazak iz transakcije:  ");
		Scanner sc = new Scanner(System.in);
		
		String vrednost = sc.nextLine(); 
		Integer vrednost1 = Integer.parseInt(vrednost);
		Double vrednost2 = Double.parseDouble(vrednost);
		
		if(vrednost == "izlaz") {
			throw new Exception("Izasli ste iz transakcije");
				
		}else if (vrednost.equals(vrednost1)) {
			System.out.println("Uspesno pretvorena int vrednost");
		}else if (vrednost.equals(vrednost2)) {
			System.out.println("Uspesno pretvorena double vrednost");
			
		}else {
			System.out.println("Neadekvatan unos vrednosti");
		}
		
		
		sc.close();
		
	}


	
	public static void ocene() throws Exception {
		
		System.out.println("Unesite broj zeljenih ocena:  ");
		Scanner sc = new Scanner(System.in);
		
		int br = sc.nextInt(); 
			
		int[] nizUnos = new int[br];
		
		
		for(int i=0;i<br;i++) {
			System.out.println("Unesi " + (i+1) + ". ocenu: ");
			nizUnos[i] = sc.nextInt();

		if((nizUnos[i]<1 || nizUnos[i]>5) && nizUnos[i]<10) {
		throw new Exception("Nisu unete adekvatne ocene ili broj adekvatnih ocena");
		
		}   else { 
			System.out.println("Tacan unos ocena");
		}
		
			}
		
	}



}



