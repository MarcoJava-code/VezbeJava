
public class DrzaveIGradovi {
	
	private String drzava;
	private String grad;
	
	
	
	
	public DrzaveIGradovi(String drzava, String grad) {
		super();
		this.drzava = drzava;
		this.grad = grad;
	}
	
	
	public String getDrzava() {
		return drzava;
	}
	public void setDrzava(String drzava) {
		this.drzava = drzava;
	}
	public String getGrad() {
		return grad;
	}
	public void setGrad(String grad) {
		this.grad = grad;
	}


	@Override
	public String toString() {
		return "ZadatakMapaDrzava [drzava=" + drzava + ", grad=" + grad + "]";
	}
	
	
	

}
