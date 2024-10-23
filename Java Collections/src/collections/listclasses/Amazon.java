package collections.listclasses;

public class Amazon implements Comparable<Amazon>{

	int prodId;
	String prodName;
	
	Amazon(int prodId, String prodName){
		this.prodId = prodId;
		this.prodName = prodName;
	}

	@Override
	public int compareTo(Amazon a) {
		return prodName.compareTo(a.prodName);
	}

//	@Override
//	public int compareTo(Amazon a) {
//		int status=0;
//		
//		if(a.prodId == prodId) {
//			status = 0;
//		}else if(a.prodId > prodId) {
//			status = -1;
//		}else if(a.prodId < prodId) {
//			status = 1;
//		}
//		
//		return status;
//	}
	
	
	
}
