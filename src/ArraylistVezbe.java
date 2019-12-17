import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ArraylistVezbe {

	public static void main(String[] args) {
		
		List<String> arrayListCopy = new ArrayList<String>();
		List<String> arrayList = new ArrayList<String>();
		arrayList.add("Boca");
		arrayList.add("Voda");
		System.out.println(arrayList);
		System.out.println("---------------------------------------");
		ListIterator<String> listIterator = arrayList.listIterator();
		for (String string : arrayList) {
			System.out.println(string);
		}
		System.out.println("---------------------------------------");
		
		arrayList.add(0, "Bunar");
		System.out.println(arrayList);
		System.out.println("---------------------------------------");
		System.out.println(arrayList.get(0));
		System.out.println("---------------------------------------");
		arrayList.set(0, "Duboki bunar");
		System.out.println(arrayList);
		System.out.println("---------------------------------------");
		arrayList.remove(2);
		System.out.println(arrayList);
		System.out.println("---------------------------------------");
		if(arrayList.contains("Boca")) {
			System.out.println("Tu je element.");
		}else
			System.out.println("Nema ga.");
		System.out.println("---------------------------------------");
		Collections.sort(arrayList);
		System.out.println(arrayList);
		System.out.println("---------------------------------------");
		Collections.copy(arrayListCopy, arrayList);

		System.out.println(arrayListCopy);                   
		System.out.println("---------------------------------------");
	}
}
