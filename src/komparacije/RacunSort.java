package komparacije;

import java.util.Comparator;

public class RacunSort implements Comparator<Radnik> {

	@Override
	public int compare(Radnik r1, Radnik r2) {
		
		return r1.getBrojRacuna().compareTo(r2.getBrojRacuna());
	}
	
	

}
