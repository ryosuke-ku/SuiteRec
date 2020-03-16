package tutorial;

public class ItemStock9 {

	public int countItemPrice(int item[]){
		int totalprice =0;
		int num = item.length;
		if (num == 0){
			return -1;
		}
		for( int k=0; k < num; k++ ) {
			totalprice += item[k];
		}
		return totalprice;
	}

}
