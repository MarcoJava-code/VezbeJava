import java.text.DecimalFormat;

public class VezbeZadatak {
	
	public static void main(String[] args){
		
		srednjaOcena(3,4,5,5,4);
		
//		try {
//			prosekOcena();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
		try {
			prosekOcena(6,7,23);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			prosekOcena(4,4,5,3,3,3,5,2,2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
	public static void srednjaOcena(int...ocene) {
		
		int suma = 0;
		double prosek;
		
		for(int i=0;i<ocene.length;i++) {
			
			suma += ocene[i];
	
		} 
		
		prosek = (double) suma / ocene.length;
		
		
		try {
			if(ocene.length == 0) {
				System.out.println("Nema unesenih ocena"); 
			}
			System.out.println("Prosek unesenih ocena je: " + prosek);
			
		} catch (Exception e) {
			
		} finally {
			
		}
		
} 
	
	public static void prosekOcena (int...ocene) throws Exception {
		if(ocene.length == 0) {
			throw new Exception("Nema unesenih ocena");
		}
		
		double suma = 0.0;
		double prosek = 0.0;
		
		for (int jednaOcena : ocene) {
			if(jednaOcena<1 || jednaOcena>5) { 
				throw new Exception ("Pogresno unesena ocena. Ocene moraju biti u opsegu 1 do 5.");
			} else {
				suma += jednaOcena;
			}
		}
		
		prosek = suma/ocene.length;
		
		DecimalFormat decimalFormat = new DecimalFormat("#.##");
		
		String rezultat = decimalFormat.format(prosek);
		
		System.out.println("Prosek unesenih ocena je: " + rezultat);
		
	}
	

}











