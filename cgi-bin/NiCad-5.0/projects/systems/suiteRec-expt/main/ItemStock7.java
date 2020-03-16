package tutorial;

class ItemStock7 {

    public int countItem(int ...item) {
        int totalcost= 0;
        int item_num = item.length;
        if (item_num == 0){
            return -1;
        }
        for( int i=0; i<item_num; i++ ){
            totalcost += item[i];
        }
        return totalcost;
    }

}
