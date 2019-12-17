package komparacije;

import java.util.Comparator;

	public class RadnikPlataSort implements Comparator<Radnik> {

		@Override
		public int compare(Radnik r1, Radnik r2) {
			if (r1.getPlata() > r2.getPlata()) {
				return 1;
			} else if (r1.getPlata() < r2.getPlata()) {
				return -1;
			} else
				return 0;
		}

}
