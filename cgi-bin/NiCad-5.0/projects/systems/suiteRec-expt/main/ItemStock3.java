package tutorial;

public class ItemStock3 {

    public int addition3(int ...item) {
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
