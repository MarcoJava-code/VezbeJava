
public class MenjacnicaVezba {
	
	private double evri;
	private double dinari;
	
	
	
	public MenjacnicaVezba(double evri, double dinari) {
		super();
		this.evri = evri;
		this.dinari = dinari;
	}
	
	
	public double pretvaranjeEvra() {
		return this.evri * 120;
	}
	
	public double pretvaranjeDinara() {
		return this.dinari / 120;
	}
	
	
	
	
	
	
	public double getEvri() {
		return evri;
	}
	public void setEvri(double evri) {
		this.evri = evri;
	}
	public double getDinari() {
		return dinari;
	}
	public void setDinari(double dinari) {
		this.dinari = dinari;
	}
	
	
	
}
