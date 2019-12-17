
public class VezbaMain {

	
	public static void main(String[] args) {
		
		MenjacnicaVezba d = new MenjacnicaVezba(0, 15000);
		MenjacnicaVezba e = new MenjacnicaVezba(10, 13000);
		double evriciZamena = e.pretvaranjeEvra();
		double dinarciciZamena = d.pretvaranjeDinara();
		
		
		System.out.println(evriciZamena);
		System.out.println(dinarciciZamena);
		

	}

}
