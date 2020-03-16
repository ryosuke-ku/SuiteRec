package tutorial;

public class Input {

	public int countPrice(int item[]){
		int totalprice =0;
		if (item.length == 0){
			return -1;
		}
		for( int i=0; i < item.length; i++ ) {
			totalprice += item[i];
		}
		return totalprice;
	}

}
