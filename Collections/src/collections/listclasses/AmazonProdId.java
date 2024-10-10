package collections.listclasses;

import java.util.Comparator;

public class AmazonProdId implements Comparator<Amazon> {

	@Override
	public int compare(Amazon a1, Amazon a2) {
		
		int status =0;
		
		if(a1.prodId == a2.prodId) {
			status = 0;
		}else if(a1.prodId > a2.prodId) {
			status = 1;
		}else if(a1.prodId < a2.prodId) {
			status = -1;
		}
		
		return status;
		
	}

}
