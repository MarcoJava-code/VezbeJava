
public class Zaposleni implements Comparable<Zaposleni> {
	
	private String ime;
	private String prezime;
	
	public Zaposleni(String ime, String prezime) {
		super();
		this.ime = ime;
		this.prezime = prezime;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	@Override
	public String toString() {
		return "Zaposleni [ime=" + ime + ", prezime=" + prezime + "]";
	}

	

	@Override
	public int compareTo(Zaposleni z1) {
		int rezultat =  this.prezime.compareTo(z1.getPrezime());
		return rezultat;
	}


	
	
	

}
