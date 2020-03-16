package tutorial;

class ItemStock6 {

	public int countPrice(int ...price) {
        int totalprice= 0;
        int num = price.length;
        if (num == 0){
            return -1;
        }
        for( int i=0; i<num; i++ ){
            totalprice += price[i];
        }
        return totalprice;
    }

}
