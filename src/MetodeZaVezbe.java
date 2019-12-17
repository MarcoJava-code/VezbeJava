
public class MetodeZaVezbe {
	
	public static double nekiUneseniBroj(int a) {
		
		int nekiUneseniBroj = a;
		if(nekiUneseniBroj>=0) {
			System.out.println("Broj " + nekiUneseniBroj + " je pozitivan.");
		}
		else {
			System.out.println("Broj " + nekiUneseniBroj + " je negativan.");
			System.out.println("----------------------------------------------");
		}
		return nekiUneseniBroj;
	}	
		
	
	public static double nekiParNeparBroj(int a) {
		
		int nekiParNeparBroj = a;
		if(nekiParNeparBroj%2==0) {
			System.out.println(nekiParNeparBroj + " je paran broj.");
		}
		else {
			System.out.println(nekiParNeparBroj + " je neparan broj.");
			System.out.println("----------------------------------------------");
		}
		return nekiParNeparBroj;
	}
	
	
	public static double nekiPozIParBroj(int a) {
		
		int nekiPozIParBroj = a;
		if(nekiPozIParBroj>=0 && nekiPozIParBroj%2==0) {
			System.out.println(nekiPozIParBroj + " je i pozitivan i paran.");
		}
		else if(nekiPozIParBroj>=0) {
			System.out.println(nekiPozIParBroj +" je samo pozitivan.");
		}
		else if(nekiPozIParBroj%2==0) {
			System.out.println(nekiPozIParBroj + " je samo paran.");
		}
		else {
			System.out.println(nekiPozIParBroj + " nije ni jedno ni drugo.");
		}
		return nekiPozIParBroj;
	}
	
	// pomocna metoda koja vraca true ako je uslov ispunjen ili false ako nije
	public static boolean pozitivanBroj(int a) {
		if(a>=0) {
			return true;
		}
		return false;
	}
	// isto
	public static boolean paranBroj(int a) {
		if(a%2==0) {
			return true;
		}
		return false;
	}
		
	public static void daLiJePozitivan(int a) {
		if(pozitivanBroj(a)) {
			System.out.println("Broj " +a +" je pozitivan broj");
		} else {
			System.out.println("Broj " +a +" je negativan broj");
		}
		
	}
	
	public static void daLiJeParan(int a) {
		if(paranBroj(a)) {
			System.out.println("Broj " +a +" je paran broj");
		} else {
			System.out.println("Broj " +a +" je neparan broj");
		}
		
	}
	
	public static void pozitivanIParan(int a) {
		
		boolean proveraPozitivan = pozitivanBroj(a);
		boolean proveraParan = paranBroj(a);
		
		if(proveraPozitivan) {
			if(paranBroj(a)) {
				System.out.println("Broj " + a + " je i pozitivan i paran broj.");
			} else {
				System.out.println("Broj " + a + " je pozitivan, ali nije paran broj.");
			}
		} else if (proveraParan) {
			System.out.println("Broj " + a + " je paran, ali nije pozitivan broj.");
		} else {
			System.out.println("Broj " + a + " nije ni paran ni  pozitivan broj.");
		}
	}
	
	
	
	public static boolean smallestNumber(int x, int y, int z) {
		
		int firstNumber = x;
		int secondNumber = y;
		int thirdNumber = z;
		
		if(firstNumber<secondNumber && firstNumber<thirdNumber) {
			System.out.println("The smallest number here is " + x +".");
		} 
		else if(secondNumber<firstNumber && secondNumber<thirdNumber) {
			System.out.println("The smallest number here is " + y +".");
		}
		else if(thirdNumber<firstNumber && thirdNumber<secondNumber) {
			System.out.println("The smallest number here is " + z +".");
		}
		return true; 
		
		
		
	}
	
	
	
	public static void podaci(String imeIPrezime) {
		
		String[] nizImePrezime = imeIPrezime.split(" ");
		String ime = nizImePrezime[0];
		String prezime = nizImePrezime[1];
		
		String[] nizImeString = ime.split("");
		char[] nizImeChar = new char[ime.length()];
		
		// napravi nizPrezimeChar  i kroz for loop ubaci vrednosti
		// kada budes ispisivao treci i cetvrti element neka bude malim slovom
		
//		for (String string : nizImeString) {
//			System.out.println(string);
//		}
		
		for (int i = 0; i < ime.length(); i++) {
			nizImeChar[i] = ime.charAt(i);
			System.out.println(nizImeChar[i]);
		}
		
		System.out.println();
		
//		if(ime.length()<5) {
//			System.out.println("Ime: " + ime + " ima manje od 5 karaktera " + "("+ime.length()+")");
//		} else {
//			System.out.println("Ime: " + ime + " ima vise ili jednako od 5 karaktera " + "("+ime.length()+")");
//		}
		
		//... uradicemo isto za prezime
		
//		String inicijali = "";
//		
//		for (int i = 0; i < nizImePrezime.length; i++) {
//			inicijali += nizImePrezime[i].toUpperCase().charAt(0);
//		}
//		
//		System.out.println(inicijali);
	}
	
	
	
	
	
	
	public static void main(String[] args) {
	
		podaci("marko Vasic");
		podaci("Sergej Milinkovic Savic");


//		smallestNumber(77,11,99);
		
		
//		nekiUneseniBroj(12);
//		nekiParNeparBroj(11);
//		nekiPozIParBroj(-10);
//		
//		daLiJePozitivan(-22);
//		daLiJeParan(543);
		
		
//		pozitivanIParan(-15);
//		pozitivanIParan(55);
//		pozitivanIParan(14);
//		pozitivanIParan(28);
//		pozitivanIParan(-16);
//		pozitivanIParan(224);
//		pozitivanIParan(-471);
//		pozitivanIParan(-28);
//		pozitivanIParan(7);
//		
		
	}
		
}
