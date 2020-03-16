package tutorial;

class ItemStock2 {

	public int addition02(int ...amounts) {
        int totalcost= 0;
        int num = amounts.length;
        if (num == 0){
            return -1;
        }
        for( int i=0; i<num; i++ ){
            totalcost += amounts[i];
        }
        return totalcost;
    }

}
