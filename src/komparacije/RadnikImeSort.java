package komparacije;

import java.util.Comparator;

public class RadnikImeSort implements Comparator<Radnik> {

	@Override
	public int compare(Radnik r1, Radnik r2) {
		return r1.getImeIPrezime().compareTo(r2.getImeIPrezime());
	}

}
