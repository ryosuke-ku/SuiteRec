package tutorial;

public class ItemStock10 {

    public int addition(int ...item) {
        int totalcost= 0;
        int num = item.length;
        if (num == 0){
			System.out.print("Input Is Empty");
            return -1;
        }
        for( int i=0; i<num; i++ ){
            totalcost += item[i];
        }
        return totalcost;
    }
}
