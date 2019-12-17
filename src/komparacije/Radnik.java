package komparacije;

public class Radnik implements Comparable<Radnik>{
	
	private String imeIPrezime;
	private String zanimanje;
	private double plata;
	private String brojRacuna;

	public Radnik(String imeIPrezime, String zanimanje, double plata, String brojRacuna) {
		super();
		this.imeIPrezime = imeIPrezime;
		this.zanimanje = zanimanje;
		this.plata = plata;
		this.brojRacuna = brojRacuna;
	}

	public String getImeIPrezime() {
		return imeIPrezime;
	}

	public void setImeIPrezime(String imeIPrezime) {
		this.imeIPrezime = imeIPrezime;
	}

	public String getZanimanje() {
		return zanimanje;
	}

	public void setZanimanje(String zanimanje) {
		this.zanimanje = zanimanje;
	}

	public double getPlata() {
		return plata;
	}

	public void setPlata(double plata) {
		this.plata = plata;
	}

	public String getBrojRacuna() {
		return brojRacuna;
	}

	public void setBrojRacuna(String brojRacuna) {
		this.brojRacuna = brojRacuna;
	}

	@Override
	public String toString() {
		return "Radnik [imeIPrezime=" + imeIPrezime + ", zanimanje=" + zanimanje + ", plata=" + plata + ", brojRacuna="
				+ brojRacuna + "]";
	}
	
	// Napravi metodu sortiranja po broju racuna

	@Override
	public int compareTo(Radnik o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
