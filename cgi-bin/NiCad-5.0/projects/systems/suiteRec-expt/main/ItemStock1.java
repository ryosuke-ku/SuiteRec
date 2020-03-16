package tutorial;

class ItemStock {

	public int addition1(int ...cost) {
        int totalcost= 0;
        int num = cost.length;
        if (num == 0){
            return -1;
        }
        for( int i=0; i<num; i++ ){
            totalcost += cost[i];
        }
        return totalcost;
    }
}
