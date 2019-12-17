package komparacije;

import java.util.Comparator;

public class RadnikPrezimeSort implements Comparator<Radnik> {

	@Override
	public int compare(Radnik r1, Radnik r2) {
		
		String prvoPrezime = r1.getImeIPrezime().substring(r1.getImeIPrezime().lastIndexOf(" "));
		String drugoPrezime = r2.getImeIPrezime().substring(r2.getImeIPrezime().lastIndexOf(" "));
		
		return prvoPrezime.compareTo(drugoPrezime);
		
		
//		return (r1.getImeIPrezime().substring(r1.getImeIPrezime().indexOf(" ")).compareTo(r2.getImeIPrezime().substring(r2.getImeIPrezime().indexOf(" "))));
	}
	
	
	
	
}
