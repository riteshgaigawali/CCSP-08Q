package collections.listclasses;

import java.util.Comparator;

public class AmazonProdName implements Comparator<Amazon>{

	@Override
	public int compare(Amazon a1, Amazon a2) {
		return a1.prodName.compareTo(a2.prodName);
	}

	
	
}
