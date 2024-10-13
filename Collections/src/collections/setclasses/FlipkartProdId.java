package collections.setclasses;

import java.util.Comparator;

public class FlipkartProdId implements Comparator<Flipkart> {
	
	int status;
	
	@Override
	public int compare(Flipkart f1, Flipkart f2) {
		if(f1.prodId == f2.prodId) {
			status = 0;
		}else if(f1.prodId > f2.prodId) {
			status = 1;
		}else if(f1.prodId < f2.prodId) {
			status = -1;
		}
		return status;
	}

}
