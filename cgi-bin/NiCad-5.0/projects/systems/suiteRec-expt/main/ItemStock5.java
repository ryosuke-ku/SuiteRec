package tutorial;

public class ItemStock5 {

    public int countItem(int ...item) {
        int totalcost= 0;
        int num = item.length;
        if (num == 0){
            return -1;
        }
        for( int i=0; i<num; i++ ){
            totalcost += item[i];
        }
        return totalcost;
    }
}
