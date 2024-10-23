package collections.setclasses;

import java.util.Comparator;

public class FlipkartProdName implements Comparator<Flipkart>{
	
	@Override
	public int compare(Flipkart f1, Flipkart f2) {
		
		return f1.prodName.compareTo(f2.prodName);
	}

}
